
package ch.arc.cours.a_lamda.b_neu_interfacefonctionelle.a_predicate;

import ch.arc.cours.g_annexe.material.Homme;
import ch.arc.cours.g_annexe.material.HommeTools;

public class UsePredicate
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
		System.out.println("filter : Predicate");

		filter();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void filter()
		{
		int n = 10;

		// standard
			{
			version1(n);
			}

		// lamda
			{
			version2(n);
			version3(n);
			}
		}

	/*------------------------------*\
	|*			Predicate<T>		*|
	\*------------------------------*/

	/**
	 * homme dont hauteur > 20
	 *
	 * classe interne anonyme
	 * use HommeManipulator
	 */
	private static void version1(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		System.out.println("Before  : "+iterable);

		// TODO
		Iterable<Homme> iterableFiltrer=null;

		System.out.println("After 1 : "+iterableFiltrer);
		}

	/**
	 * homme dont hauteur > 20
	 *
	 * lamda dans variable
	 */
	private static void version2(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		// TODO
		Iterable<Homme> iterableFiltrer=null;

		System.out.println("After 2 : "+iterableFiltrer);
		}

	/**
	 * homme dont hauteur > 20
	 *
	 * lamda
	 */
	private static void version3(int n)
		{
		Iterable<Homme> iterable = HommeTools.create(n);

		// TODO
		Iterable<Homme> iterableFiltrer=null;

		System.out.println("After 3 : "+iterableFiltrer);
		}

	}
