
package ch.arc.cours.b_stream.b_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.Assert;

public class UseStream_00_Creation
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
		System.out.println("Stream : array list set concatenation");

		// obtenir un stream
			{
			useList1();
			useList2();
			useArray1();
			}

		// operation ensembliste
			{
			useConcatenation1();
			}

		// Iterable
			{
			useIterable();
			}

		// see too, next chapter
		// stream_indice
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				List			*|
	\*------------------------------*/

	/**
	 * fabrication stream et count
	 */
	private static void useList1()
		{
		List<Integer> list = Arrays.asList(1, 2, 3);

		// v1 (avec variable explicite stream)
			{
			Stream<Integer> stream = list.stream();

			long count = -1;// TODO : replace -1 by code
			// count : terminal, impossible employer stream ensuite

			Assert.assertTrue(count == list.size());
			}

		// v2 (sans varaible explicite stream)
			{
			long count = -1;// TODO : replace -1 by code

			Assert.assertTrue(count == list.size());
			}
		}

	/**
	 * fabrication stream et count partielle
	 *
	 * Quoi: 		Recuperation des parties des elements de la stream
	 * 				Donner le début : skip
	 * 				Donner le nombre d'élment à pendre en partant du stream coupé : limit
	 *
	 * Comment : 	skip, limit,count
	 */
	private static void useList2()
		{
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		int skip = 3; // saute 3 elements
		int limit = 2; // puis garde 2 elements
		// => [4,5]

		//Indication list.stream()
		long count = -1;// TODO replace -1 by code
		// skip  : non terminal, stream-in -> stream-out
		// limit : non terminal, stream-in -> stream-out
		// count : terminal, impossible employer stream ensuite

		Assert.assertTrue(count == limit);
		}

	/*------------------------------*\
	|*				Array			*|
	\*------------------------------*/

	/**
	 * fabrication stream et count
	 */
	private static void useArray1()
		{
		Integer[] tab = { 1, 2, 3 };

		// v1 : Indication : Arrays.stream(tab);
			{
			long count = -1;// TODO replace -1 by code
			// count : terminal, impossible employer stream ensuite

			Assert.assertTrue(count == tab.length);
			}

		// v2 : Indication : Stream.of(tab)
			{
			long count = -1;// TODO replace -1 by code

			Assert.assertTrue(count == tab.length);
			}

		// Warning : piege des vesrions "of"
			{
			List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

			Stream<List<Integer>> stream = Stream.of(list);// observer le type du stream!
			// voulu  : Stream<Integer>
			// obtenu : Stream<List<Integer>>
			}
		}

	/*------------------------------*\
	|*				concat			*|
	\*------------------------------*/

	private static void useConcatenation1()
		{
		// Container
		Integer[] tab = { 1, 2, 3 };
		List<Integer> list = List.of(4, 5, 6);
		Set<Integer> set = Set.of(7,8,9);

		// Stream
		Stream<Integer> streamTab = null; //TODO
		Stream<Integer> streamList = null; //TODO
		Stream<Integer> streamSet = null; //TODO

		// Concatenation
		Stream<Integer> streamTabList = null;// TODO Indication Stream.concat
		Stream<Integer> streamAll = null;//TODO

		// Check
		Assert.assertTrue(streamAll.count() == tab.length + list.size() + set.size());
		}

	/*------------------------------*\
	|*				Iterable		*|
	\*------------------------------*/

	/**
	 * recuperation et count
	 */
	private static void useIterable()
		{
		List<Integer> list = List.of(1, 2, 3);
		work(list);
		}

	private static void work(Iterable<Integer> iterable)
		{
		// Indications:
		//		(I1) 	Difficile!
		//		(I2)	Use classe Streams
		//
		// Note: Streams, classe custom, pas dans jre, see packahe tools!

		long count = -1;// TODO

		Assert.assertTrue(count == 3);
		}

	}
