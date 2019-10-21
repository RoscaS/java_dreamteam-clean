
package ch.arc.cours.c_consolidation;

import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;

import org.junit.Assert;

import ch.arc.cours.g_annexe.tools.Chrono;


public class UseDefi
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
		System.out.println("defi");

		defi();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * Question 1: 	Combien de thread utilisé dans un stream parallel?
	 * Question 2: 	Afficher le nom de ces threads
	 *
	 * Indications:
	 *
	 * 				Step 1 : stream parallel de [0,Integer.MAX_VALUE[
	 * 				Step 2 : Recupérer nom des threads (mapToObj)
	 * 				Step 3 : Les collecter dans un set,
	 * 				Step 4 : Regarder la taille du set
	 *
	 * 				mapToObj
	 * 					 - sert à fabriquer le nom des threads
	 * 					 - requiert IntFunction<T>
	 */
	private static void defi()
		{
		int n = Integer.MAX_VALUE;

		// parallel
			{
			Chrono chrono = new Chrono();

			IntFunction<String> nameThread = null; // TODO lamda (reference methode impossible)
			Set<String> setThreadName = null;// TODO

			chrono.stop();

			print(setThreadName, "parallel", chrono);
			}

		// sequentiel (pour voir difference de performance)
			{
			Chrono chrono = new Chrono();

			IntFunction<String> nameThread = null;// TODO lamda (reference methode impossible)
			Set<String> setThreadName = null;// TODO

			chrono.stop();

			print(setThreadName, "sequential", chrono);

			// check
				{
				Assert.assertTrue(setThreadName.size() == 1);
				}
			}
		}

	private static void print(Set<String> setThreadName, String title, Chrono chrono)
		{
		System.out.println("\nNameThread : \n");

		Consumer<String> print = null;// TODO Reference methode
		setThreadName.forEach(print);

		System.out.println();
		System.out.println("#Thread    = " + setThreadName.size());
		System.out.println("#processor = " + Runtime.getRuntime().availableProcessors());
		System.out.println(title + " " + chrono);
		}

	}
