
package ch.arc.cours.lamda.function.c_original.c_mixte.version2;

import org.junit.Assert;

public class UseMixte2
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
		System.out.println("math : Function : mixte2");

		exerciceDefaultMethode();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * f(x) = cos(x)*sin(x)+sin(x)*sin(x)
	 */
	private static void exerciceDefaultMethode()
		{
		FunctionDouble cos = null; // TODO
		FunctionDouble sin =  null; // TODO

		// v1
			{
			FunctionDouble cosSin =  null; // TODO default methode
			FunctionDouble sin2 = null; // TODO default methode
			FunctionDouble f =  null; // TODO default methode

			Assert.assertTrue(isEquals(f.apply(Math.PI / 4), 1));
			Assert.assertTrue(f.apply(Math.PI / 2) == 1);
			}

		// v2
			{
			FunctionDouble f =  null; // TODO default methode, one line

			Assert.assertTrue(isEquals(f.apply(Math.PI / 4), 1));
			Assert.assertTrue(f.apply(Math.PI / 2) == 1);
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
