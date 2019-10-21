
package ch.arc.cours.b_stream.c_stream_indice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * Attention aux deux types ci-dessous:
 *
 * 		Stream<Integer>
 * 		IntStream
 *
 * Avantage :
 *
 * 		IntStream	plus riche que 	Stream<Integer>
 *
 * Conseil :
 *
 * 		Utiliser IntStream dès que possible!
 *
 */
public class UseStream_02_range
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
		System.out.println("Stream indice : range");

		useRange();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*		range	 				*|
	\*------------------------------*/

	/**
	 * Quoi: 		boucle by stream
	 *
	 * Comment :	IntStream : range
	 */
	private static void useRange()
		{
		int n = 3;

		// Rappel
			{
			// code de base
				{
				for(int i = 0; i < n; i++)
					{
					System.out.println(i);
					}
				}

			// forEach lambda dans variable (Rappel)
				{
				List<Integer> listSource = List.of(1, 2, 3);

				Consumer<Integer> print = null;//TODO
				listSource.forEach(print);
				}

			// forEach reference methode
				{
				List<Integer> listSource = Arrays.asList(1, 2, 3);

				//TODO
				}
			}

		// new Range
			{
			// range : lambda dans variable
				{
				IntConsumer print = null;//TODO
				IntStream.range(0, n).forEach(print);
				// [0,n[
				}

			// range : lambda sans variable
				{
				// TODO
				// [0,n[
				}

			// range :  lambda reference methode
				{
				// TODO
				// [0,n[
				}
			}

		}

	}
