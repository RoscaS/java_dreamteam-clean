
package ch.arc.cours.c_consolidation;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

import org.junit.Assert;

import ch.arc.cours.b_stream.d_referencemethode.tools.CheckTools;
import ch.arc.cours.g_annexe.tools.Int;

public class UseContainerConvertion
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
		System.out.println("consolidation");

		// convertion, revision Int
			{
			arraytoList_Int();
			listToArray_Int();
			}

		// convertion, revision int
			{
			listToArray_int();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*		convertion Int			*|
	\*------------------------------*/

	/**
	 * <pre>
	 *
	 * transformation d'un tableau en list, facile!
	 *
	 * Warning : deux versions:
	 *
	 * 			(V1)	Copie superficielle (objet partager)
	 * 			(V2)	Copie profonde (clone de tout)
	 *
	 * </pre>
	 */
	private static void arraytoList_Int()
		{
		System.out.println("\n[arraytoList] :\n");

		Int[] tab = { new Int(1), new Int(2), new Int(3) };

		System.out.println("array " + Arrays.toString(tab));

		// sans stream : Copie superficielle
			{
			List<Int> list = Arrays.asList(tab);

			System.out.println("list  " + list);
			Assert.assertTrue(CheckTools.isSuperficialCopy(list, tab));
			}

		// avec stream
			{
			// Copie superficielle
				{
				// Indication : collect
				List<Int> list = null;// TODO

				// check
					{
					Assert.assertTrue(CheckTools.isSuperficialCopy(list, tab));

					tab[0].setValue(100); // modifier l'originale, modifie la copie
					System.out.println("\nCopie superficielle :");
					System.out.println("list  " + list);
					System.out.println("tab   " + Arrays.toString(tab));
					}
				}

			// Copie profonde
				{
				// Indications :
				//		(I1)  map (reference methode) pour la copie
				//		(I2)	collect
				List<Int> list = null;// TODO

				// check
					{
					Assert.assertTrue(CheckTools.isDeapCopy(list, tab));

					tab[0].setValue(1000);// modifier la copie ne modifie pas l'originale
					System.out.println("\nCopie profonde :");
					System.out.println("list  " + list);
					System.out.println("tab   " + Arrays.toString(tab));
					}
				}
			}
		}

	/**
	 * <pre>
	 *
	 * transformation d'une liste en tableau, plus difficile!
	 *
	 * Warning : deux versions:
	 *
	 * 			(V1)	Copie superficielle (objet partager)
	 * 			(V2)	Copie profonde (clone de tout)
	 *
	 * </pre>
	 */
	private static void listToArray_Int()
		{
		System.out.println("\n[listToArray] :\n");

		List<Int> list = Arrays.asList(new Int(1), new Int(2), new Int(3));

		// sans stream
			{
			// v1 : Copie superficielle
				{
				Int[] tab = list.toArray(new Int[0]); // taille zero!

				// check
					{
					Assert.assertTrue(CheckTools.isSuperficialCopy(list, tab));

					tab[0].setValue(100);// modifier la copie modifie l'originale
					System.out.println("\nCopie superficielle :");
					System.out.println("tab   " + Arrays.toString(tab));
					System.out.println("list  " + list);
					}
				}



			// v2 : Copie superficielle
				{
				Int[] tab = new Int[list.size()];
				list.toArray(tab);

				// check
					{
					Assert.assertTrue(CheckTools.isSuperficialCopy(list, tab));

					tab[0].setValue(1000); // modifier la copie modifie l'originale
					System.out.println("\nCopie superficielle :");
					System.out.println("tab   " + Arrays.toString(tab));
					System.out.println("list  " + list);
					}
				}
			}

		// avec stream
			{
			// V1 : copie superficielle
				{

				// lamda
					{
					// generator :
					// 		input  : n la taille du tableau
					// 		output : un tableau d'Int de taille n

					IntFunction<Int[]> generator = null;// TODO

					// Indications :
					//		step 1: fabriquer generator
					//		step 2: toArray
					Int[] tab = null;// TODO

					// check
						{
						Assert.assertTrue(CheckTools.isSuperficialCopy(list, tab));

						tab[1].setValue(200); // modifier la copie modifie l'originale
						System.out.println("\nCopie superficielle :");
						System.out.println("tab   " + Arrays.toString(tab));
						System.out.println("list  " + list);
						}
					}

				// reference de methode avec variable
					{
					IntFunction<Int[]> generator = null;// TODO
					Int[] tab = null;// TODO

					// check
						{
						Assert.assertTrue(CheckTools.isSuperficialCopy(list, tab));

						tab[1].setValue(2000); // modifier la copie modifie l'originale
						System.out.println("\nCopie superficielle :");
						System.out.println("tab   " + Arrays.toString(tab));
						System.out.println("list  " + list);
						}
					}

				// reference de methode sans variable
					{
					Int[] tab = null;//TODO

					// check
						{
						Assert.assertTrue(CheckTools.isSuperficialCopy(list, tab));

						tab[1].setValue(3000); // modifier la copie modifie l'originale
						System.out.println("\nCopie superficielle :");
						System.out.println("tab   " + Arrays.toString(tab));
						System.out.println("list  " + list);
						}
					}
				}

			// V2 : copie profonde
				{
				// v2.1		lamda sans variable, sans reference methode
					{
					// Indication : comme ci-dessus, mais inserer un map qui force la copy dans le pipe de stream
					Int[] tab = null;// TODO

					System.out.println(Arrays.toString(tab));

					// check
						{
						Assert.assertTrue(CheckTools.isDeapCopy(list, tab));

						tab[2].setValue(300); // modifier la copie ne modifie pas l'originale
						System.out.println("\nCopie profonde :");
						System.out.println("tab   " + Arrays.toString(tab));
						System.out.println("list  " + list);
						}
					}

				// v2.2 	uniquememt reference methode
					{
					Int[] tab = null;// TODO

					// check
						{
						Assert.assertTrue(CheckTools.isDeapCopy(list, tab));

						tab[2].setValue(3000);// modifier la copie ne modifie pas l'originale
						System.out.println("\nCopie profonde :");
						System.out.println("tab   " + Arrays.toString(tab));
						System.out.println("list  " + list);
						}
					}
				}
			}
		}

	/*------------------------------*\
	|*		convertion int			*|
	\*------------------------------*/

	/**
	 * Idem ci-dessus, mais ici le type simple : int
	 * Plus simple!
	 */
	private static void listToArray_int()
		{
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		int[] tab = null;// TODO

		System.out.println(Arrays.toString(tab));
		}

	}
