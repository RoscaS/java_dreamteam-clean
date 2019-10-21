
package ch.arc.cours.b_stream.b_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import ch.arc.cours.g_annexe.material.Personne;
import ch.arc.cours.g_annexe.material.PersonneTools;

public class UseStream_02_Collect
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
		int n = 5;

		System.out.println("stream : collect");

		// to Collection
			{
			useCollectToList1(n);
			useCollectToList2(n);
			useCollectToSet(n);
			}

		// reduce & stat
			{
			useCollectToReduce(n);
			useCollectToStat(n);
			}

		// Grouping
			{
			// difficult see later
			}

		useSort();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*		toCollection			*|
	\*------------------------------*/

	/**
	 * Quoi : 	 	filter				collect
	 * Comment :	Predicate<T>		Collectors
	 *
	 * Probleme :	list personne dont age > 50
	 */
	private static void useCollectToList1(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		System.out.println("originale : " + list);

		Predicate<Personne> ageBigger50 = null;// TODO

		List<Personne> listFilter = null;// TODO
		// filter  : non terminal , stream-in -> stream-out
		// collect : terminal , interdit use stream after

		System.out.println("age > 50 : " + listFilter);
		}

	/**
	 * Quoi : 	 	filter				map					collect
	 * Comment :	Predicate<T>		Function<T1,T2>		Collectors
	 *
	 * Probleme :	list hauteur personne dont age > 50
	 */
	private static void useCollectToList2(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		// lambda, reference methode si possible
			{
			Predicate<Personne> ageBigger50 = null;// TODO

			List<Integer> listHauteur = null;// TODO
			// filter  : non terminal , stream-in -> stream-out
			// map     : non terminal , stream-in -> stream-out
			// collect : terminal , interdit use stream after

			System.out.println("hauteur avec age > 50 : " + listHauteur);
			}
		}

	/**
	 * Quoi : 	 	filter				map					collect
	 * Comment :	Predicate<T>		Function<T1,T2>		Collectors
	 *
	 * Probleme :	set hauteur personne dont age > 50
	 */
	private static void useCollectToSet(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		// lambda, reference methode si possible
			{
			// TODO
			Predicate<Personne> ageBigger50 = null;
			Set<Integer> setHauteur = null;
			// filter  : non terminal , stream-in -> stream-out
			// map     : non terminal , stream-in -> stream-out
			// collect : terminal , interdit use stream after

			System.out.println("hauteur avec age > 50 : " + setHauteur);
			}
		}

	/*------------------------------*\
	|*		sort / ToCollection		*|
	\*------------------------------*/

	/**
	 * Quoi : 	 	tri				collect
	 * Comment :	sorted			Collectors
	 *
	 * Probleme :	tri
	 */
	private static void useSort()
		{
		Integer[] tab = { 9, 5, 7, 2, 4, 3, 1, 6, 8 };

		// tri naturel, reference methode
			{
			List<Integer> listSorted = null;// TODO

			System.out.println("tri croissant : " + listSorted);
			}

		// tri decroissant, lamda for comparator (indication multiply by -1)
			{
			Comparator<Integer> decroissant = null;// TODO

			List<Integer> listSorted = null;// TODO

			System.out.println("tri decroissant : " + listSorted);
			}
		}

	/*------------------------------*\
	|*		Reduction				*|
	\*------------------------------*/

	/**
	 * Quoi : 	 	map					collect
	 * Comment :	Function<T1,T2>		Collectors.reducing
	 *
	 * Probleme :	somme des hauteurs
	 */
	private static void useCollectToReduce(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		// lambda, reference methode si possible
			{
			// contrainte : reduce interdit
			// indication: use collect
			Integer sumHauteur = null;// TODO
			// map     : non terminal , stream-in -> stream-out
			// collect : terminal , interdit use stream after

			System.out.println("sumHauteur : " + sumHauteur);
			}
		}

	/**
	 * Probleme :	statistique des ages
	 */
	private static void useCollectToStat(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		// lambda, reference methode si possible
			{
			// v1
				{
				// Step 1 : map standard dans la stream
				// Step 2 : collect
				// Step 3 : Collectors et utiliser un mapper identity

				IntSummaryStatistics stat = null;//TODO
				// collect : terminal , interdit use stream after

				System.out.println("stat age : " + stat);
				}

			//v2
				{
				// Contrainte : mapping interdit dans la stream!

				// Step 1 : collect
				// Step 2 : Collectors et faire mapping ici

				IntSummaryStatistics stat = null;//TODO
				// collect : terminal , interdit use stream after

				System.out.println("stat age : " + stat);
				}
			}
		}

	/*------------------------------*\
	|*		grouping				*|
	\*------------------------------*/

	// Difficult, see later

	}
