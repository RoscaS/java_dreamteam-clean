
package ch.arc.cours.lamda.function.c_original.a_1_variable;

import java.util.function.Function;

import org.junit.Assert;

public class UseFunctionMath
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
		System.out.println("math : Function");

		function();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void function()
		{
		apply();
		compose();
		andThen();

		methodeReference();
		}

	/*------------------------------*\
	|*		Function<T1,T2>			*|
	\*------------------------------*/

	/**
	 * h(x)= 2*x
	 * g(x)= x+1
	 *
	 * f(x) = h(x)+g(x)
	 */
	private static void apply()
		{
		//lamda dans variable
			{
			Function<Double, Double> h = null;// TODO
			Function<Double, Double> g = null;// TODO

			Function<Double, Double> f = null;// TODO lambda with apply

			Assert.assertTrue(f.apply(2d) == 7);
			}
		}

	/**
	 * h(x)= x+1
	 * g(x)= x*x
	 *
	 * f(x) = (x*x) + 1 = (h o g) (x)= h(g(x))
	 */
	private static void compose()
		{
		// lamda dans variable
			{
			Function<Double, Double> h = null;// TODO
			Function<Double, Double> g = null;// TODO

			Function<Double, Double> f = null;// TODO use default methode

			Assert.assertTrue(f.apply(2d) == 5);
			}
		}

	/**
	 * f(x) = 2(x+1)
	 */
	private static void andThen()
		{
		// lamda dans variable
			{
			Function<Double, Double> h = null;// TODO
			Function<Double, Double> g = null;// TODO

			Function<Double, Double> f = null;// TODO use default methode

			Assert.assertTrue(f.apply(2d) == 6);
			}
		}

	/**
	 * f(x) = sqrt(cos(x))
	 */
	private static void methodeReference()
		{
		// lamda dans variable
			{
			Function<Double, Double> h = null;// TODO Lambda
			Function<Double, Double> g = null;// TODO Lambda

			Function<Double, Double> f = null;// TODO use Default methode

			Assert.assertTrue(isEquals(f.apply(2 * Math.PI), 1));
			}

		// reference methode
			{
			Function<Double, Double> h = null;// TODO reference methode
			Function<Double, Double> g = null;// TODO reference methode

			Function<Double, Double> f = null;// TODO use Default methode

			Assert.assertTrue(isEquals(f.apply(2 * Math.PI), 1));
			}
		}

	/*------------------------------*\
	|*				tools			*|
	\*------------------------------*/

	private static boolean isEquals(double x1, double x2)
		{
		final double epsilon = 1e-6;
		return Math.abs(x1 - x2) < epsilon;
		}

	}
