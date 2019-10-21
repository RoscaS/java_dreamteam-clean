
package ch.arc.cours.c_consolidation;

import java.util.Arrays;

import ch.arc.cours.g_annexe.material.Worker;

public class UseBoucle
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
		System.out.println("boucle by stream");

		useBoucle();
		useCreateTab();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * remplacement de la boucle for
	 */
	private static void useBoucle()
		{
		int n = 10;

		// sequentiel : code standad
			{
			System.out.println("sequentiel");

			for(int i = 0; i < n; i++)
				{
				Worker.work(i);
				}
			}

		// sequentiel : sans stream avec Consumer
			{
			int[] tabIndice = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

			// TODO
			}

		// parallel : IntStream infinite
			{
			System.out.println("\nparallel : stream infinite");

			// TODO
			}

		// parallel : IntStream range [0,n[
			{
			System.out.println("\nparallel : IntStream");

			// TODO
			}
		}

	/**
	 * creer et initialier un tableau
	 */
	private static void useCreateTab()
		{
		int n = 3;

		// V1 : tableau externe
			{
			// sequentiel : code standad
				{
				double[] tab = new double[n];

				for(int i = 0; i < n; i++)
					{
					tab[i] = i * Math.PI;
					}

				System.out.println(Arrays.toString(tab));
				}

			// parallel : IntStream  infinite
				{
				double[] tab = new double[n];

				// Indication : Stream
				// Indication : iterate
				// Indication : foreach,mettre resultat dans tab deja existant

				// TODO

				System.out.println(Arrays.toString(tab));
				}

			// parallel : IntStream range
				{
				double[] tab = new double[n];

				// Indication : Stream
				// Indication : range [0,n[
				// Indication : foreach, mettre resultat dans tab deja existant

				// TODO

				System.out.println(Arrays.toString(tab));
				}
			}

		// V2 Ici le array de destination est creer par la stream, il n'existe pas avant!
			{
			// DoubleStream
			// range
			// mapToDouble

			double[] tab = null; // TODO Tout sur cette ligne

			System.out.println(Arrays.toString(tab));
			}

		}

	}
