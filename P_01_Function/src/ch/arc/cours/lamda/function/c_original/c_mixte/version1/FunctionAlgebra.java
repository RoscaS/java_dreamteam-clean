
package ch.arc.cours.lamda.function.c_original.c_mixte.version1;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * see later version3, the best version
 */
public class FunctionAlgebra
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static Function<Double, Double> add(Function<Double, Double> h, Function<Double, Double> g)
		{
		// v1 : lamda dans variable
			{
			// TODO
			}

		// V2 : lamda
			{
			return null;// TODO
			}

		// v3: use private methode ci-dessous
//				{
//				BiFunction<Double, Double, Double> addition = null;//TODO
//				return null;//TODO
//				}
		}

	public static Function<Double, Double> prod(Function<Double, Double> h, Function<Double, Double> g)
		{
		// v1 : lamda dans variable
			{
			// TODO
			}

		// v2 : lamda
			{
			return null;// TODO
			}

		// v3: use private methode ci-dessous
		//			{
		//			BiFunction<Double, Double, Double> produit = null;//TODO
		//			return null;//TODO
		//			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*		Function<T1,T2>			*|
	|*		BiFunction<T1,T2,T3>	*|
	\*------------------------------*/

	/**
	 * f= h op g
	 * f(x) = h(x) op g(x)
	 *
	 * examples:
	 * 		op = +
	 * 		op = *
	 */
	private static <T1, T2> Function<T1, T2> op(Function<T1, T2> h, Function<T1, T2> g, BiFunction<T2, T2, T2> op)
		{
		Function<T1, T2> f = null; //TODO
		return f;
		}

	}
