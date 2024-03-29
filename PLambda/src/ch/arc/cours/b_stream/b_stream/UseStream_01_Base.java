
package ch.arc.cours.b_stream.b_stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.Assert;

import ch.arc.cours.g_annexe.material.Personne;
import ch.arc.cours.g_annexe.material.PersonneTools;

public class UseStream_01_Base
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

		System.out.println("stream : interface fonctionel :  classique");

		usePredicate(n);
		useConsumer(n);
		usePredicateConsumer(n);

		useBinaryOperator();

		usePredicateBinaryOperator();
		useFunctionBinaryOperator(n);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * Quoi : 	 	Filter
	 * Comment :	Predicate<T>
	 *
	 * Probleme :	nombre de personne dont l'age est > 50
	 */
	private static void usePredicate(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		System.out.println("Avant : " + list);

		Predicate<Personne> ageBigger50 = null;// TODO

		long count = -1;// TODO
		// count : terminal, interdit employer stream apres

		System.out.println("age > 50 : " + count);
		}

	/**
	 * Quoi : 	 	forEach
	 * Comment :	Consumer<T>
	 *
	 * Probleme :	incrementer de 1 l'age des personnes
	 */
	private static void useConsumer(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		// lambda dans variable
			{
			Consumer<Personne> incAge = null; // TODO

			// TODO

			// forEach : terminal, interdit employer stream apres, sur place
			}

		// reference methode
			{
			// TODO

			// forEach : terminal, interdit employer stream apres,sur place
			}

		System.out.println("Apres : " + list);
		}

	/**
	 * Quoi : 	 	filter				forEach
	 * Comment :	Predicate<T>		Consumer<T>
	 *
	 * Probleme :	incrementer de 1 l'age des personnes > 50
	 */
	private static void usePredicateConsumer(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		// lambda dans variable, reference methode si possible
			{
			Predicate<Personne> ageBigger50 = null;//TODO
			Consumer<Personne> incAge = null;//TODO

			//TODO

			// filter : non terminal stream-in, stream-out
			// forEach : terminal , sur place, interdit employer stream apres, sur place
			}

		System.out.println("Apres : " + list);
		}

	/**
	 * Quoi : 	 	reduce
	 * Comment :	BinaryOperator<T>
	 *
	 * Probleme :	somme des elements de la liste
	 */
	private static void useBinaryOperator()
		{
		List<Integer> list = List.of(1, 2, 3);

		// lambda
			{
			Integer sum = null;// TODO
			// reduce : terminal, interdit employer stream apres

			Assert.assertTrue(sum == 1 + 2 + 3);
			}

		// reference methode
			{
			Integer sum = null;// TODO
			// reduce : terminal, interdit employer stream apres

			Assert.assertTrue(sum == 1 + 2 + 3);
			}
		}

	/**
	 * Quoi : 	 	filter			reduce
	 * Comment :	Predicate<T> 	BinaryOperator<T>
	 *
	 * Probleme :	somme des elements paires de la liste
	 */
	private static void usePredicateBinaryOperator()
		{
		Integer[] tab = { 1, 2, 3, 4 };

		Predicate<Integer> isPaire = null;	// TODO

		// lambda || reference methode
			{
			Integer sum = null;// TODO
			// filter : non terminal stream-in, stream-out
			// reduce : terminal, interdit employer stream apres

			Assert.assertTrue(sum == 2 + 4);
			}
		}

	/**
	 * Quoi : 	 	map					reduce
	 * Comment :	Function<T1,T2> 	BinaryOperator<T>
	 *
	 * Probleme :	somme des ages
	 */
	private static void useFunctionBinaryOperator(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		// reference methode
			{
			Integer sum = null;// TODO
			// map    : non terminal, stream-in, stream-out
			// reduce : terminal, interdit employer stream apres

			System.out.println("somme des ages = " + sum);
			}

		// see next chapter : mapToInt!
		}

	}
