
package ch.arc.cours.e_complement.a_argmax;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

import org.junit.Assert;

import ch.arc.cours.g_annexe.material.Voiture;
import ch.arc.cours.g_annexe.material.VoitureTools;

public class UseArgMax
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
		System.out.println("argmax");

		// reduction
			{
			// max
				{
				reduceMax();
				}

			// argmax
				{
				reduceArgmax_manuel();
				reduceArgmax();
				}
			}

		// direct
			{
			trier();// Echauffement
			argmax_direct();
			}

		// indice
			{
			argmax_indice();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			Max / Echauffememt	*|
	\*------------------------------*/

	private static void reduceMax()
		{
		int n = 3;
		List<Voiture> list = VoitureTools.create(n);

		// TODO
		// Indication 1 : stream parallel
		// Indication 2 : map
		// Indication 3 : reduce
		Integer prixMax = null;

		System.out.println(list);
		System.out.println("prixMax : " + prixMax);
		Assert.assertTrue(prixMax == 1000 + n - 1);
		}

	/*------------------------------*\
	|*	argmax par reduction		*|
	\*------------------------------*/

	/**
	 * <pre>
	 *
	 * Soit f: x -> y
	 *
	 * Observation 1:
	 *
	 * 		max(f) se trouve sur l'axe des y
	 *
	 * Definition 1:
	 *
	 * 		argmax(f) n'est pas le max de f, mais le x qui realise le max de f.
	 *
	 * Observation 2:
	 *
	 * 		argmax(f) se trouve sur l'axe des x
	 *
	 * Clin d'oeil:
	 *
	 * 		f(argmax(f))=max(f)
	 *
	 * </pre>
	 */
	private static void reduceArgmax_manuel()
		{
		int n = 100;
		List<Voiture> list = VoitureTools.create(n);

		// But:  	on veut pas le prix max,
		// 			mais la voiture dont le prix est max!
		// 			ie on cherche non pas le max, mais l'argmax

		BinaryOperator<Voiture> mostExpensive = new BinaryOperator<Voiture>()
			{

			@Override
			public Voiture apply(Voiture v1, Voiture v2)
				{
				// Rappel: compare
				//
				// 		compare(a,b) == -1 ssi a<b
				// 		compare(a,b) == 0 ssi a==b
				// 		compare(a,b) == 1 ssi a>b

				// return voiture la plus cher
				switch(Integer.compare(v1.getPrix(), v2.getPrix()))
					{
					case -1:
						return null; // TODO
					case 0:
						return null; // TODO
					case 1:
						return null; // TODO
					default:
						{
						Assert.fail();
						return null;
						}
					}
				// Note : Code non agreable a produire!!
				}
			};

		// Indication :
		//					reduction standard:
		//					- avec l'operator argmax ci-dessus
		//					- sans valeur d'init
		Optional<Voiture> voitureMostExpensive = null;// TODO Une stream avec des voitures du debut jusqu'a la fin

		// check
			{
			System.out.println();
			System.out.println(list);
			System.out.println("\nvoitureMoreExpensive : " + voitureMostExpensive);
			Assert.assertTrue(voitureMostExpensive.isPresent());
			Assert.assertTrue(voitureMostExpensive.get() == list.get(list.size() - 1));
			}
		}

	/**
	 * idem ci-desus
	 * mais code plus propre!
	 */
	private static void reduceArgmax()
		{
		int n = 100;
		List<Voiture> list = VoitureTools.create(n);

		// But:  	on veut pas le prix max,
		// 			mais la voiture dont le prix est max!
		// 			ie on cherche non pas le max, mais l'argmax

		// Indication 1 : Utiliser: BinaryOperator.maxBy(comparator)
		Comparator<Voiture> prix = null;//TODO
		BinaryOperator<Voiture> mostExpensive = null;//TODO

		// Indication 2: reduction standard avec l'operator ci-dessus, sans valeur d'init
		Optional<Voiture> voitureMostExpensive = null; // TODO Une stream avec des voitures du debut jusqu'a la fin

		// check
			{
			System.out.println();
			System.out.println(list);
			System.out.println("\nvoitureMostExpensive : " + voitureMostExpensive);
			Assert.assertTrue(voitureMostExpensive.isPresent());
			Assert.assertTrue(voitureMostExpensive.get() == list.get(list.size() - 1));
			}
		}

	/*------------------------------*\
	|*		argmax direct			*|
	\*------------------------------*/

	/**
	 * trier selon le prix
	 *
	 * Note : Echauffement pour argmax sans reduction
	 */
	private static void trier()
		{
		int n = 100;
		List<Voiture> list = VoitureTools.create(n);

		List<Voiture> listVoitureSorted = null; // TODO Une stream avec des voitures du debut jusqu'a la fin

		System.out.println("\noriginal : ");
		System.out.println(list);
		System.out.println("\nTrier:");
		System.out.println(listVoitureSorted);
		}

	/**
	 * argmax sans reduction
	 */
	private static void argmax_direct()
		{
		int n = 100;
		List<Voiture> list = VoitureTools.create(n);

		// But:  	on veut pas le prix max,
		// 			mais la voiture dont le prix est max!
		// 			ie on cherche non pas le max, mais l'argmax

		// Indication : utiliser max sur la stream
		Comparator<Voiture> prix = null;//TODO
		Optional<Voiture> voitureMostExpensive = null; // TODO Une stream avec des voitures du debut jusqu'a la fin
		// Observation:
		// Ci-dessus, on donnait a sorted un comparator. Grace a ce comparator, sorted pouviat trier.
		// Ici on donne comparator a max, et max utilise le comprator pour extraire la voiture la plus cher.
		// max est un peu comme un sorted, mais il en fait moins, l'output n'est pas une liste dans l'orde des prix, mais uniquement la voiture la plus cher.

		// check
			{
			System.out.println();
			System.out.println(list);
			System.out.println("\nvoitureMostExpensive : " + voitureMostExpensive);
			Assert.assertTrue(voitureMostExpensive.isPresent());
			Assert.assertTrue(voitureMostExpensive.get() == list.get(list.size() - 1));
			}
		}

	/**
	 * argmax sans reduction
	 * avec stream d'indice
	 *
	 * Note : Version pour le fun (Ce n'est pas celle a preferrer)
	 */
	private static void argmax_indice()
		{
		int n = 100;
		List<Voiture> list = VoitureTools.create(n);
		Voiture[] tab = list.parallelStream().toArray(Voiture[]::new);

		// But:  	on veut pas le prix max,
		// 			mais la voiture dont le prix est max!
		// 			ie on cherche non pas le max, mais l'argmax

		// BinaryOperator<T>
		// a op b = c
		// ici c sera soit a, soit b : Le gagnant est celui qui possede la voiture la plus cher
		// Attention les inputs sont des indices (int) et l'output est aussi un indice et un int.
		// Utiliser l'operarteur tertiaire ? dans la pratie droite du lambda
		IntBinaryOperator indiceVoitureMostExpensive = null;// TODO

		// Reduction sur une stream d'indice: on reduit en gardant l'indice qui possede la voiture la plus cher
		// L'output est un indice
		int iWinner = -1;// TODO
		Voiture voitureMostExpensive = tab[iWinner];

		// check
			{
			System.out.println();
			System.out.println(list);
			System.out.println("\nvoitureMostExpensive : " + voitureMostExpensive);
			Assert.assertTrue(voitureMostExpensive == list.get(list.size() - 1));
			}
		}

	}
