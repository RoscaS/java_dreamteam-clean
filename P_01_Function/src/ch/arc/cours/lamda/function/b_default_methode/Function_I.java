
package ch.arc.cours.lamda.function.b_default_methode;

/**
 * <pre>
 * Modele 1:
 *
 * 		Interface = liste de methodes :
 *
 * 						- public
 * 						- non static
 * 						- non implementer
 *
 * Modele 2: (depuis java8)
 *
 * 		Interface = liste de methodes :
 *
 * 						- public
 * 						- non static
 * 						- non implementer
 *
 * 					et ensemble optionel de
 *
 * 						- "default methode", ie de methode implementer
 *
 * Definition:
 *
 * 		public, private, protected et  default 		sont 4 types de "MODIFIER"
 *
 * Link:
 *
 * 		https://dzone.com/articles/interface-default-methods-java
 *
 * </pre>
 */
@FunctionalInterface
public interface Function_I
	{

	public double value(double x);

	/*------------------------------*\
	|*			  Default			*|
	\*------------------------------*/

	/**
	 * <pre>
	 * (fog)(x) = f(g(x))
	 *
	 * f is this
	 *
	 * ordre inverse de andThen ci-dessous
	 * </pre>
	 */
	default Function_I compose(Function_I g)
		{
		return null;// TODO lambda
		}

	/**
	 * <pre>
	 * (gof)(x) = g(f(x))
	 *
	 * f is this
	 *
	 * ordre inverse de compose ci-dessous
	 * </pre>
	 */
	default Function_I andThen(Function_I g)
		{
		// v1
			{
			return null;// TODO lambda
			}

		// v2
		//			{
		//			return null;// TODO interdiction d'employez lambda, use default methode
		//			}
		}
	}
