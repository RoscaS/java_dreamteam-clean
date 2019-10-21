
package ch.arc.cours.b_stream.d_referencemethode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

import ch.arc.cours.g_annexe.material.Joueur;

public class UseReferenceMethode_02_training
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
		System.out.println("reference methode : training 02");

		list();
		array();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * Construire une list de joueur depuis un tableau de nom
	 */
	private static void list()
		{
		String[] tabName = { "bob", "marc", "alice", "claire" };

		// lamda, sans variable
			{
			// Indication : Collectors
			List<Joueur> listJoueur = null;// TODO

			incrementerGain(listJoueur, 99);
			System.out.println(listJoueur);
			}

		// reference methode, sans variable
			{
			List<Joueur> listJoueur = null;// TODO

			incrementerGain(listJoueur, 99);
			System.out.println(listJoueur);
			}
		}

	/**
	 * Construire un tableau de joueur depuis un tableau de nom
	 */
	private static void array()
		{
		String[] tabName = { "bob", "marc", "alice", "claire" };

		// lamda, avec variable
			{
			IntFunction<Joueur[]> generatorJoeurArray = null;// TODO
			Function<String, Joueur> nameToJoueur = null;// TODO

			Joueur[] tabJoueur = null;// TODO

			incrementerGain(Arrays.asList(tabJoueur), 99);
			System.out.println(Arrays.toString(tabJoueur));
			}

		// reference methode, avec variable
			{
			IntFunction<Joueur[]> generatorJoeurArray = null;// TODO
			Function<String, Joueur> nameToJoueur = null;// TODO

			Joueur[] tabJoueur = null;// TODO

			incrementerGain(Arrays.asList(tabJoueur), 99);
			System.out.println(Arrays.toString(tabJoueur));
			}

		// reference methode, sans variable
			{
			Joueur[] tabJoueur = null;// TODO

			incrementerGain(Arrays.asList(tabJoueur), 99);
			System.out.println(Arrays.toString(tabJoueur));
			}
		}

	/**
	 * incremente le gain de chaque joueur par l'input gain
	 */
	private static void incrementerGain(Iterable<Joueur> iterableJoueur, int gain)
		{
		// Contraintes: en parallel!

		// Indication : Streams
		// TODO
		}

	}
