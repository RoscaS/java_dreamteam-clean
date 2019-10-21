
package ch.arc.cours.lamda.function.c_original.b_2_variable;

import org.junit.Assert;

public class UseBiFunctionMath
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
		System.out.println("math : BiFunction");

		biFunction();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void biFunction()
		{
		hello();
		add1();
		add2();
		}

	/*------------------------------*\
	|*		BiFunction<T1,T2,T3>	*|
	\*------------------------------*/

	/**
	 * f(x1,x2)= (x1-x2) + (x1*x2)
	 */
	private static void hello()
		{
		BiFunctionDouble f = null;// TODO

		Assert.assertTrue(f.apply(3d, 2d) == 7);
		}

	/**
	 * h(x1,x2)= x1 - x2
	 * g(x1,x2)= x1 * x2
	 *
	 * f(x1,x2) =  h(x1,x2) + g(x1,x2)
	 */
	private static void add1()
		{
		BiFunctionDouble h = null;// TODO
		BiFunctionDouble g = null;// TODO

		BiFunctionDouble f = null;// TODO apply

		Assert.assertTrue(f.apply(3d, 2d) == 7);
		}

	/**
	 * h(x1,x2)= x1 - x2
	 * g(x1,x2)= x1 * x2
	 *
	 * f(x1,x2) =  h(x1,x2) + g(x1,x2)
	 */
	private static void add2()
		{
		BiFunctionDouble h = null;// TODO
		BiFunctionDouble g = null;// TODO

		BiFunctionDouble f = null;// TODO use custom default methode (add first default methode add in BiFunctionDouble)

		Assert.assertTrue(f.apply(3d, 2d) == 7);
		}

	}
