
package ch.arc.cours.b_stream.d_referencemethode;

import java.util.Arrays;
import java.util.Comparator;

public class UseReferenceMethode_03_training
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
		System.out.println("reference methode : training 03");

		sortSansStream();
		sortAvecStream();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * tri d'un tableau de string
	 */
	private static void sortSansStream()
		{
		// sans stream
			{
			// classe interne anonyme
				{
				String[] tab = { "maison", "banane", "Meteo", "repas" };

				System.out.println("avant : " + Arrays.asList(tab));

				Comparator<String> comparator = new Comparator<String>()
					{

					@Override
					public int compare(String s1, String s2)
						{
						return s1.compareTo(s2);
						}
					};

				Arrays.sort(tab, comparator); // sur place

				System.out.println("après : " + Arrays.toString(tab));
				}

			// sans stream, tri parallel,lambda
				{
				String[] tab = { "maison", "banane", "Meteo", "repas" };

				// TODO, sans stream, tri parallel !
				// sur place

				System.out.println("après : " + Arrays.toString(tab));
				}

			// sans stream, tri parallel, reference methode
				{
				String[] tab = { "maison", "banane", "Meteo", "repas" };

				// TODO
				// sur place

				System.out.println("après : " + Arrays.toString(tab));
				}
			}

		}

	/**
	 * tri d'un tableau de string
	 */
	private static void sortAvecStream()
		{
		// avec stream, tri parallel
			{
			String[] tab = { "maison", "banane", "Meteo", "repas" };

			// v1 : lambda
				{
				String[] tabSorted = null;// TODO

				System.out.println("après : " + Arrays.toString(tabSorted));
				}

			// v2 : reference methode
				{
				String[] tabSorted = null;// TODO

				System.out.println("après : " + Arrays.toString(tabSorted));
				}
			}
		}

	}
