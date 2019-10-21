
package ch.arc.cours.d_sequential_to_parralel;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

import ch.arc.cours.g_annexe.material.HistoTools;

public class UseSequentialToParallel_02_histo
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		System.out.println("sequentiel to parallel : histo");

		// Standard
			{
			histoStandard();
			}

		// stream
			{
			histoStreamSequentiel1();
			histoStreamSequentiel2();
			histoStreamParallel();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * standard
	 */
	private static void histoStandard()
		{
		System.out.println("\nfor : \n");

		// Data
		int limite = 256; // data in [0,LIMIT[
		int[] tabData = HistoTools.createDataInput(limite);

		// code standard, sequentiel
			{
			int[] histo = new int[limite];

			// init
				{
				for(int s = 0; s < histo.length; s++)
					{
					histo[s] = 0;
					}
				}

			// fill
				{
				for(int s = 0; s < tabData.length; s++)
					{
					histo[tabData[s]]++;
					}
				}

			// check
				{
				//System.out.println("tabData" + Arrays.toString(tabData));
				System.out.println("Histo" + Arrays.toString(histo));
				HistoTools.check(histo);
				}
			}
		}

	/**
	 * stream
	 * int[] histo : creer avant la stream
	 */
	private static void histoStreamSequentiel1()
		{
		System.out.println("\nstream : \n");

		// Data
		int limite = 256; // data in [0,LIMIT[
		int[] tabData = HistoTools.createDataInput(limite);

		int[] histo = new int[limite];

		// init histo  : parallel
		// Indication 1 : range [0,LIMITE[
		// Indication 2 : forEach, sur histo deja existant

		// TODO

		// fill histo : sequentiel !! (Version parallel, see later chapter grouping)
		// Indication 1 : range [0,n[
		// Indication 2 : forEach,sur histo deja existant

		// TODO

		// check
			{
			System.out.println("Histo" + Arrays.toString(histo));
			HistoTools.check(histo);
			}
		}

	/**
	 * histogramme, idem previous mais avec un init different
	 * int[] histo : creer par la sream
	 */
	private static void histoStreamSequentiel2()
		{
		System.out.println("\nstream : \n");

		int limite = 256; // data in [0,LIMIT[
		int[] tabData = HistoTools.createDataInput(limite);

		// init histo  : parallel
		// Indication 1 : range [0,LIMITE[
		// Indication 2 : mapToLong
		// Indication 3 : toArray

		long[] histo = null; // TODO La stream init et cree le tableau

		// fill histo : sequentiel !!
		// TODO (Idem previous version)

		// check
			{
			System.out.println("Histo" + Arrays.toString(histo));
			HistoTools.check(histo);
			}
		}

	/**
	 * Tout en parallel!

	 */
	private static void histoStreamParallel()
		{
		System.out.println("\nstream : \n");

		int limite = 256; // data in [0,LIMIT[
		int[] tabData = HistoTools.createDataInput(limite);

		// Indicatation: Utiliser AtomicLong au lieu de long

		// init
		AtomicLong[] histo = null; // TODO La stream init et cree le tableau

		// fill
		// TODO

		// check
			{
			System.out.println("Histo" + Arrays.toString(histo));
			HistoTools.check(histo);
			}
		}

	}
