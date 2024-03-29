
package ch.arc.cours.a_lamda.b_neu_interfacefonctionelle.d_function;

import java.util.List;

import org.junit.Assert;

import ch.arc.cours.g_annexe.material.Maison;
import ch.arc.cours.g_annexe.material.MaisonTools;

public class UseFilterMapReduce
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
		System.out.println("filter map Reduce : Predicate Function binaryOperator ");

		filterMapReduce();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void filterMapReduce()
		{
		int n = 4;
		List<Maison> list = MaisonTools.create(n);

		int sum1 = version1(list);
		int sum2 = version2(list);
		int sum3 = version3(list);
		int sum4 = version4(list);

		// check
			{
			System.out.println(list);

			check(list, sum1);
			check(list, sum2);
			check(list, sum3);
			check(list, sum4);
			}
		}

	/*--------------------------------------------------*\
	|*	Predicate<T> Function<T1,T2>  BinaryOperator<T> *|
	\*--------------------------------------------------*/

	/**
	 * somme des prix des maisons dont nbPiece>20
	 *
	 * Classe Interne anonyme
	 */
	private static int version1(List<Maison> list)
		{

		// TODO
		return -1;
		}

	/*------------------------------*\
	|*				lamda			*|
	\*------------------------------*/

	/**
	 * somme des prix des maisons dont nbPiece>20
	 *
	 * lamda dans variable
	 */
	private static int version2(List<Maison> list)
		{
		// TODO
		return -1;
		}

	/**
	 * somme des prix des maisons dont nbPiece>20
	 *
	 * lamda
	 */
	private static int version3(List<Maison> list)
		{
		// TODO
		return -1;
		}

	/**
	 * somme des prix des maisons dont nbPiece>20
	 *
	 * lamda, reference methode pour :
	 * 		prix de Maison
	 * 		sum de Integer
	 */
	private static int version4(List<Maison> list)
		{
		// TODO

		return -1;
		}

	/*------------------------------*\
	|*				Tools			*|
	\*------------------------------*/

	private static void check(List<Maison> list, int sum)
		{
		System.out.println("sum prix = " + sum);

		Assert.assertTrue(sum == 7);
		}

	}
