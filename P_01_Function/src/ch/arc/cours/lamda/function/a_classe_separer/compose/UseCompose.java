
package ch.arc.cours.lamda.function.a_classe_separer.compose;

import org.junit.Assert;

import ch.arc.cours.lamda.function.a_classe_separer.Function_I;

public class UseCompose
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
		System.out.println("Compose");

		useComposition1();
		useComposition2();
		useComposition3();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * x -> x*x+1
	 *
	 * h(x)= x+1
	 * g(x)= x*x
	 * (h o g) (x)= h(g(x))
	 *
	 * Classe interne anonyme dans variable
	 */
	private static void useComposition1()
		{
		Function_I h=null;// TODO

		Function_I g=null;// TODO

		Function_I u1 = FunctionAlgebra.composition1(h, g);
		Function_I u2 = FunctionAlgebra.composition2(h, g);
		Function_I u3 = FunctionAlgebra.composition3(h, g);

		check(u1, u2, u3);
		}

	/**
	 * x -> x*x+1
	 *
	 * h(x)= x+1
	 * g(x)= x*x
	 *
	 * (h o g) (x)= h(g(x))
	 *
	 * lamda dans variable
	 */
	private static void useComposition2()
		{
		Function_I h=null;// TODO
		Function_I g=null;// TODO

		Function_I u1 = FunctionAlgebra.composition1(h, g);
		Function_I u2 = FunctionAlgebra.composition2(h, g);
		Function_I u3 = FunctionAlgebra.composition3(h, g);

		check(u1, u2, u3);
		}

	/**
	 * x -> x*x+1
	 *
	 * h(x)= x+1
	 * g(x)= x*x
	 *
	 * (h o g) (x)= h(g(x))
	 *
	 * lamda
	 */
	private static void useComposition3()
		{
		// Lambda sans varaible : Pas pratique dans ce cas, on fait pas !!
			{
			// a completer
			// Function_I u1 = FunctionCompose.composition1(h, g);
			// Function_I u2 = FunctionCompose.composition2(h, g);
			// Function_I u3 = FunctionCompose.composition3(h, g);

			// check(u1, u2, u3);
			}
		}

	/*------------------------------*\
	|*				Tools			*|
	\*------------------------------*/

	private static void check(Function_I u1, Function_I u2, Function_I u3)
		{
//		System.out.println(u1.value(2));
//		System.out.println(u2.value(2));
//		System.out.println(u3.value(2));

		Assert.assertTrue(u1.value(2) == 2 * 2 + 1);
		Assert.assertTrue(u2.value(2) == 2 * 2 + 1);
		Assert.assertTrue(u3.value(2) == 2 * 2 + 1);
		}

	}
