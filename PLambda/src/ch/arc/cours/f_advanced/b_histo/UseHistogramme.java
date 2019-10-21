
package ch.arc.cours.f_advanced.b_histo;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import ch.arc.cours.g_annexe.material.HistoTools;

public class UseHistogramme
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
		System.out.println("histo : sequentiel to parallel");

		histoStandard();
		histoStreamSequentiel();

		histoStreamParalel1_AtomicInteger();
		histoStreamParalel_Grouping();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * code standard
	 */
	private static void histoStandard()
		{
		// Input
		int limite = 256; // data in [0,LIMIT[
		int[] tabData = HistoTools.createDataInput(limite);

		// Output
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
			System.out.println("Histo" + Arrays.toString(histo));
			HistoTools.check(histo);
			}
		}

	/**
	 * stream sequential
	 */
	private static void histoStreamSequentiel()
		{
		// Input
		int limite = 256; // data in [0,LIMIT[
		int[] tabData = HistoTools.createDataInput(limite);

		// Output

		// init : paralel
		// Indication 1 : stream range [0,LIMITE[
		// Indication 2 : toArray
		int[] histo = null; // TODO

		// fill : sequentiel
		// Indication 1: stream sur tab
		// Indication 2: foreach sur histo

		// TODO

		// check
			{
			System.out.println("Histo" + Arrays.toString(histo));
			HistoTools.check(histo);
			}
		}

	/**
	 * stream parallel AtomicInteger
	 */
	private static void histoStreamParalel1_AtomicInteger()
		{
		// Input
		int limite = 256; // data in [0,LIMIT[
		int[] tabData = HistoTools.createDataInput(limite);

		// init paralel : v1
		AtomicInteger[] histoAtomic = new AtomicInteger[limite];

		// init paralel de histoAtomic existant
		// Indication 1 : stream range [0,LIMITE[
		// Indication 2 : forEach, init histoAtomic

		// TODO

		// init parallel : v2
		// Indication 1  : stream range [0,LIMITE[
		// Indication 2  : mapToObj pour passer en AtomicInteger
		// Indication 3  : toArray
		// Note : ici on utilise pas un tableau deja existant, mais on le génère!

		// TODO

		// fill paralel
		// Indication 1 : stream range [0,n[

		// But : 		AtomicInteger[] to int[]
		// Indication : mapToInt
		int[] histo = null;// TODO

		// check
			{
			System.out.println("Histo" + Arrays.toString(histo));
			HistoTools.check(histo);
			}
		}

	/**
	 * stream parallel sans AtomicInteger
	 */
	private static void histoStreamParalel_Grouping()
		{
		// Input
		int limite = 256; // data in [0,LIMIT[
		int[] tabData = HistoTools.createDataInput(limite);

		// Rappel important : Collectors.groupingBy
		//		- Output est une map<key,value>
		//		- La valeur de la map et une list<T> ou T est le type forunit par la stream !!!
		//		- la key de map est fournit par un classifier  Collectors.groupingBy(classifier)


		// v1
		// Principe : utiliser une map:
		//					- key :    les valeurs possibles des data (tab)
		//					- valeur : la frequence de la cle
		// Indication 1 : stream sur tab
		// Indication 2 : boxed pour une Stream<Integer> et Collectors usage
		// Indication 3 : grouping et counting, soyez malin
		Map<Integer, Long> mapHisto1 = null; // TODO

		// v2
		// Indicatiuon : idem v1 ci-dessus, mais avec Function.identity()
		Map<Integer, Long> mapHisto2 = null; // TODO

		// Finalisation, utile?
			{
			// But : Map to array, ie Map<Integer, Long> to long[]
			long[] histo = new long[limite];
			// Indication 1 : stream sur entrySet
			// Indication 2 : forEach

			// TODO

			// check
				{
				System.out.println("Histo" + Arrays.toString(histo));
				HistoTools.check(histo);
				}
			}
		}

	}
