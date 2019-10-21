
package ch.arc.cours.b_stream.b_stream;

import java.util.List;

import org.junit.Assert;

import ch.arc.cours.g_annexe.material.Personne;
import ch.arc.cours.g_annexe.material.PersonneTools;

public class UseStream_04_parallel
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
		int n = 5;

		System.out.println("stream : parallel");

		list(n);
		arrayInteger();
		arrayInt();
		iterable(n);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	// Revision!

	/*------------------------------*\
	|*				List			*|
	\*------------------------------*/

	/**
	 * Probleme :	somme des hauteur des personnes dont age > 50
	 *
	 * Contraintes :
	 * 		(C1)	stream parallel
	 * 		(C2)	code plus court possible
	 */
	private static void list(int n)
		{
		List<Personne> list = PersonneTools.create(n);

		System.out.println(list);

		int sumHauteur = -1; // TODO

		System.out.println("sumHauteur avec age >50  : " + sumHauteur);
		}

	/*------------------------------*\
	|*				Array			*|
	\*------------------------------*/

	/**
	 * Probleme :	somme n premiers entiers
	 *
	 * Contraintes :
	 * 		(C1)	stream parallel
	 * 		(C2)	code plus court possible
	 */
	private static void arrayInteger()
		{
		final int n = 9;
		Integer[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Rappel : Arrays.stream(tab) est une Stream<Integer>
		int sum = -1;//TODO

		Assert.assertTrue(sum == n * (n + 1) / 2);
		}

	/**
	 * Idem ci-dessus, mais en int
	 */
	private static void arrayInt()
		{
		final int n = 9;
		int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Rappel : Arrays.stream(tab) est une intStream !
		int sum = -1;//TODO

		Assert.assertTrue(sum == n * (n + 1) / 2);
		}

	/*------------------------------*\
	|*				Iterable		*|
	\*------------------------------*/

	/**
	 * Probleme :	somme des hauteur des personnes dont age > 50
	 *
	 * Contraintes :
	 * 		(C1)	stream parallel
	 * 		(C2)	code plus court possible
	 */
	private static void iterable(int n)
		{
		Iterable<Personne> iterable = PersonneTools.create(n);

		// Indications : Streams
		int sumHauteur = -1;// TODO

		System.out.println("sumHauteur avec age >50  : " + sumHauteur);
		}

	}
