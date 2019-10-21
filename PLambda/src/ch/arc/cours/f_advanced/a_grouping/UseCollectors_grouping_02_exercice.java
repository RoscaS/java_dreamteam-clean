
package ch.arc.cours.f_advanced.a_grouping;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import ch.arc.cours.g_annexe.tools.CollectionTools;

public class UseCollectors_grouping_02_exercice
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
		System.out.println("collectors : groupingBy : exercice");

		exercice();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * Contexte :	On s'intéresse au nombre de thread dans une stream parallel,
	 * 				On aimerait savoir quel thread s'occupe de travailler quel indice
	 *
	 * Output : 	Une map avec
	 * 					key = nameThread
	 * 					value = list des indices travailler par le thread
	 */
	private static void exercice()
		{
		int n = Runtime.getRuntime().availableProcessors() * 10;//Integer.MAX_VALUE;

		// TODO
		// Indication 1 : stream range fournit des int
		// Indication 2 : collect
		// Indication 3 : groupingBy avec nameThread : La stream fournit des int, le classifier les regroupe par nom de threads

		Function<Integer, String> nameThread = null; // classifier, on recupere le nom du thread travaillant sur l'indice i.

		// Rappel important : Collectors.groupingBy
		//		- Output est une map<key,value>
		//		- La valeur de la map et une list<T> ou T est le type forunit par la stream !!!
		//		- la key de map est fournit par un classifier  Collectors.groupingBy(classifier)

		// Problem : collect, n'existe pas sur IntStream
		// Solution: convertir : IntStream to Stream<Integer> avec boxed()
		//
		// Note : boxed est l'inverse de mapToInt
		// 			- boxed     :  IntStream       to   Stream<Integer>
		//			- mapToInt  :  Stream<Integer> to   IntStream

		Map<String, List<Integer>> mapNameIndice = null;

		CollectionTools.print("[groupingBy nameThread]", mapNameIndice);
		System.out.println("#processor =" + Runtime.getRuntime().availableProcessors());
		}

	}
