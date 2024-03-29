
package ch.arc.cours.a_lamda.b_neu_interfacefonctionelle.d_function;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

import ch.arc.cours.g_annexe.material.Maison;



public class MaisonManipulator
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * see chapter stream to see beautiful flexible optimized code
	 */
	public static void mapPrint(Iterable<Maison> iterable, Function<Maison, Integer> function)
		{
		for(Maison maison:iterable)
			{
			// TODO
			int attribut = -1;

			System.out.println(attribut);
			}
		}

	/**
	 * see chapter stream to see beautiful flexible optimized code
	 */
	public static void mapPrintInt(Iterable<Maison> iterable, ToIntFunction<Maison> function)
		{
		for(Maison maison:iterable)
			{
			// TODO
			int attribut = -1;

			System.out.println(attribut);
			}
		}

	/**
	 * see chapter stream to see beautiful flexible optimized code
	 */
	public static int mapReduce(Iterable<Maison> iterable, Function<Maison, Integer> function, BinaryOperator<Integer> operator, int initValue)
		{
		int value = initValue;

		for(Maison maison:iterable)
			{
			// TODO
			}

		return value;
		}

	/**
	 * see chapter stream to see beautiful flexible optimized code
	 */
	public static int filterMapReduce(Iterable<Maison> iterable, Predicate<Maison> predicate, Function<Maison, Integer> function, BinaryOperator<Integer> operator, int initValue)
		{
		int value = initValue;

		for(Maison maison:iterable)
			{
			// TODO
			}

		return value;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
