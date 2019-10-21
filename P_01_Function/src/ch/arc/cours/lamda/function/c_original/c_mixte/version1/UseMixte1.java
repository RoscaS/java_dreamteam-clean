
package ch.arc.cours.lamda.function.c_original.c_mixte.version1;

import java.util.function.Function;

import org.junit.Assert;

public class UseMixte1
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
		System.out.println("math : Function : mixte1");

		exerciceSyntaxe();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * f(x) = cos(x)*cos(x)+sin(x)*sin(x)
	 */
	private static void exerciceSyntaxe()
		{
		Function<Double, Double> cos = null;// TODO reference methode
		Function<Double, Double> sin = null;// TODO reference methode

		Function<Double, Double> cos2 = null;// TODO use AlgebreFunction
		Function<Double, Double> sin2 = null;// TODO use AlgebreFunction
		Function<Double, Double> f = null;// TODO use AlgebreFunction

		Assert.assertTrue(f.apply(Math.PI) == 1);
		Assert.assertTrue(f.apply(Math.PI / 2) == 1);
		}

	/*------------------------------*\
	|*				tools			*|
	\*------------------------------*/

//	private static boolean isEquals(double x1, double x2)
//		{
//		final double epsilon = 1e-6;
//		return Math.abs(x1 - x2) < epsilon;
//		}

	}
