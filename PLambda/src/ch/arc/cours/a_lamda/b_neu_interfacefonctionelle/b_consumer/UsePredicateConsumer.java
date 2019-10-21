
package ch.arc.cours.a_lamda.b_neu_interfacefonctionelle.b_consumer;

import ch.arc.cours.g_annexe.material.Homme;
import ch.arc.cours.g_annexe.material.HommeTools;

public class UsePredicateConsumer
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
		System.out.println("foreach & filter: Consumer & Predicate");

		foreachFilter();
		}

	private static void foreachFilter()
		{
		int n = 5;

		// standard
			{
			version1(n);
			}

		// lamda
			{
			version2(n);
			version3(n);
			version4(n);
			version5(n);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*	Predicate<T> & Consumer<T>	*|
	\*------------------------------*/

	/**
	 * Opposer le poids de l'homme, dont la hauteur est > 20
	 *
	 * Classe interne anonyme dans variable
	 */
	private static void version1(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		System.out.println("Before  : " + iterable + "\n");

		// TODO

		System.out.println("After 1 : " + iterable);
		}

	/**
	 * Opposer le poids de l'homme, dont la hauteur est > 20
	 *
	 * lamda dans variable
	 */
	private static void version2(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		// TODO

		System.out.println("After 2 : " + iterable);
		}

	/**
	 * Opposer le poids de l'homme, dont la hauteur est > 20
	 *
	 * lamda
	 */
	private static void version3(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		// TODO

		System.out.println("After 3 : " + iterable);
		System.out.println(iterable);
		}

	/**
	 * Opposer le poids de l'homme, dont la hauteur est > 20
	 *
	 * reference methode
	 * avec variable
	 */
	private static void version4(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		// TODO

		System.out.println("After 4 : " + iterable);
		System.out.println(iterable);
		}

	/**
	 * Opposer le poids de l'homme, dont la hauteur est > 20
	 *
	 * reference methode
	 * sans variable
	 */
	private static void version5(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		// TODO

		System.out.println("After 5 : " + iterable);
		System.out.println(iterable);
		}


	}