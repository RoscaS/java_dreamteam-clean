
package ch.arc.cours.b_stream.a_foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Assert;

import ch.arc.cours.g_annexe.tools.Int;

public class UseForeEach
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
		System.out.println("foreach : vers les streams ...");

		foreachList();
		foreachArray();
		limite();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * 1 2 3  -> 1 4 9   elever au carrer
	 */
	private static void foreachList()
		{
		List<Integer> list = Arrays.asList(1, 2, 3);
		System.out.println("Before = " + list);

		// standard
			{
			List<Integer> listCarrer = new ArrayList<Integer>(list.size());

			for(Integer x:list)
				{
				// TODO
				}

			System.out.println("After = " + listCarrer);
			}

		// list.forEach : classe interne anonyme
			{
			List<Integer> listCarrer = new ArrayList<Integer>(list.size());

			Consumer<Integer> xCarrerToList = null; // TODO utilisation possible dans une classe interne anonyme d'une reference vers un objet; ici listCarrer (qui n'est pas final)

			list.forEach(xCarrerToList);

			System.out.println("After = " + listCarrer);
			}

		// list.foreach, lamda
			{
			List<Integer> listCarrer = new ArrayList<Integer>(list.size());

			// TODO
			// utilisation possible dans une lambda d'une reference vers un objet externe
			// ici listCarrer (qui n'est pas final)

			System.out.println("After = " + listCarrer);
			}
		}

	/**
	 * foreachArray existe pas!
	 *
	 * Solution :  voir un array comme une liste !
	 */
	private static void foreachArray()
		{
		Integer[] tab = { 1, 2, 3 };
		List<Integer> list = Arrays.asList(tab);

		// list.foreach, lamda
			{
			List<Integer> listCarrer = new ArrayList<Integer>(list.size());

			// TODO

			System.out.println("After = " + listCarrer);
			}
		}

	/**
	 * Defi : compter le nombre d'élément de la liste
	 *
	 * Contrainte :
	 *
	 * 		(C1) 	sans utiliser size
	 * 		(C2) 	avec list.foreach
	 */
	private static void limite()
		{
		List<Integer> list = Arrays.asList(1, 2, 3);

		// version naive: compile pas!
		// Une variable de type simple utuiliser dans une classe interne anonyme doit etre final!
		// Mais si on met count, en final, count++ ne compile plus!
			{
			//			int count = 0;
			//			list.forEach(i -> count++);
			}

		// version avec classe custom Int (comme Integer mais alterable)
			{
			Int count = new Int(0);

			// TODO

			Assert.assertTrue(count.intvalue() == list.size());
			}
		}

	}
