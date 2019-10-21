
package ch.arc.cours.a_lamda.b_neu_interfacefonctionelle.b_consumer;

import ch.arc.cours.g_annexe.material.Homme;
import ch.arc.cours.g_annexe.material.HommeTools;

public class UseConsumer
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
		System.out.println("foreach : Consumer");

		foreach();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void foreach()
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

	/*------------------------------*\
	|*			Consumer<T>			*|
	\*------------------------------*/

	/**
	 * Quoi 	: 	Opposer le poids de l'homme
	 * Exemple  :	7 -> -7
	 * Comment	: 	use methode opposePoids de Homme
	 *
	 * Essayer aussi provisoirement : afficher le poids de l'homme!
	 *
	 * classe interne anonyme
	 */
	private static void version1(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		System.out.println("Before  : " + iterable + "\n");

		// TODO

		System.out.println("After 1 : " + iterable);
		}

	/**
	 * Opposer le poids de l'homme
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
	 * Opposer le poids de l'homme
	 *
	 * lamda
	 */
	private static void version3(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		// TODO

		System.out.println("After 3 : " + iterable);
		}

	/**
	 * Opposer le poids de l'homme
	 *
	 * reference methode
	 * avec variable
	 */
	private static void version4(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		// TODO

		System.out.println("After 4 : " + iterable);
		}

	/**
	 * Opposer le poids de l'homme
	 *
	 * reference methode
	 * sans variable
	 */
	private static void version5(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		// TODO

		System.out.println("After 5 : " + iterable);
		}

	}
