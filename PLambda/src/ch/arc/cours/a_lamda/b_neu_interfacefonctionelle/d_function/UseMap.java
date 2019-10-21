
package ch.arc.cours.a_lamda.b_neu_interfacefonctionelle.d_function;

import java.util.List;

import ch.arc.cours.g_annexe.material.Maison;
import ch.arc.cours.g_annexe.material.MaisonTools;

public class UseMap
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
		System.out.println("map : Function");

		mapping();
		}

	private static void mapping()
		{
		int n = 3;
		List<Maison> list = MaisonTools.create(n);

		System.out.println(list);

		printSurface(list);
		printPrix(list);
		printPiece(list);

		printSurfaceInt(list);
		printPrixInt(list);
		printPieceInt(list);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			Function<T1,T2>		*|
	\*------------------------------*/

	private static void printSurface(List<Maison> list)
		{
		// version : classe interne anonyme dans variable
			{
			// TODO
			}

		// Version : lamda dans variable
			{
			// TODO
			}

		// Version : lamda
			{
			// TODO
			}

		// Version : lamda : reference methode
			{
			// TODO
			}
		}

	private static void printPiece(List<Maison> list)
		{
		// Version : lamda
			{
			// TODO
			}

		// Version : lamda : reference methode
			{
			// TODO
			}
		}

	private static void printPrix(List<Maison> list)
		{
		// Version : lamda
			{
			// TODO
			}

		// Version : lamda : reference methode
			{
			// TODO
			}
		}

	/*------------------------------*\
	|*		ToIntFunction<T>		*|
	\*------------------------------*/

	private static void printSurfaceInt(List<Maison> list)
		{
		// Version : lamda dans variable
			{
			// TODO
			}

		// Version : lamda
			{
			// TODO
			}

		// Version : lamda : reference methode
			{
			// TODO
			}
		}

	private static void printPieceInt(List<Maison> list)
		{
		// Version : lamda
			{
			// TODO
			}

		// Version : lamda : reference fonction
			{
			// TODO
			}
		}

	private static void printPrixInt(List<Maison> list)
		{
		// Version : lamda
			{
			// TODO
			}

		// Version : lamda : reference methode
			{
			// TODO
			}
		}

	}
