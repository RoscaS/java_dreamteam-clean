
package ch.arc.cours.lamda.function.c_original.c_mixte.version3;

import java.util.function.Function;

import ch.arc.cours.lamda.function.c_original.b_2_variable.BiFunctionDouble;

public interface FunctionDouble extends Function<Double, Double>
	{
	/*------------------------------*\
	|*			  Default			*|
	\*------------------------------*/

	// TODO
	//
	// Ajouter des default methode pour:
	//		- additioner deux fonctions	g et h :	g(x)+h(x)
	//		- multiplier deux fonctions	g et h :	g(x)*h(x)
	//		- elever au carrer une fonction g  :	g(x)*g(x)
	//
	// Indications :
	//
	//		(I1) Attention au prototype et a  this!
	//
	//		(I2) Aidez-vous d'une operateur fonctionel generic (cf op ci-dessous)
	//
	// Contrainte :
	//
	//		(C1)	lambda sans variable

	/**
	 * <pre>
	 * f(x) op g(x)
	 * f is this
	 * </pre>
	 */
	public default FunctionDouble op(FunctionDouble g, BiFunctionDouble op)
		{
		return null; // TODO
		}

	// TODO
	//
	// Une fois useMixte3 Fonctionel et ce fichier coder,  mettez en commentaire la methode op ci-dessus
	// Inventez une methode op qui fait la meme chose mais avec une signature differente
	// Tester là
	//
	// Indication : utiliser autre chose pour BiFunctionDouble !

	}
