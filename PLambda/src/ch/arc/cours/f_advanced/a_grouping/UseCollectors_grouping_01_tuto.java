
package ch.arc.cours.f_advanced.a_grouping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ch.arc.cours.g_annexe.material.Voyageur;
import ch.arc.cours.g_annexe.material.VoyageurTools;
import ch.arc.cours.g_annexe.tools.CollectionTools;

public class UseCollectors_grouping_01_tuto
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
		System.out.println("collectors : groupingBy : example");

		// groupingBy
			{
			useCollectToMap_Tuto1();
			useCollectToMap_Tuto2();
			}
		}
	// https://www.baeldung.com/java-groupingby-collector
	// https://4comprehension.com/the-ultimate-guide-to-the-java-stream-api-groupingby-collector/
	// https://www.mkyong.com/java8/java-8-collectors-groupingby-and-mapping-example/
	// https://dzone.com/articles/java-streams-groupingby-examples

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*		value default collector	*|
	\*------------------------------*/

	/**
	 * Probleme   :	regrouper les voyageurs par ville
	 *
	 * Contrainte : output dans Map avec:
	 * 						- key   = Ville
	 *                      - value = List voyageur
	 */
	private static void useCollectToMap_Tuto1()
		{
		Voyageur[] tabVoyageur = VoyageurTools.create(); // Voyageur(name,city, money)

		CollectionTools.println("data input", tabVoyageur);

		// code standard :  groupingBy city
			{
			Map<String, List<Voyageur>> mapCityVoyageur = new HashMap<String, List<Voyageur>>();

			for(Voyageur voyageur:tabVoyageur)
				{
				String city = voyageur.getCity();

				if (!mapCityVoyageur.containsKey(city))
					{
					mapCityVoyageur.put(city, new LinkedList<Voyageur>());
					}

				mapCityVoyageur.get(city).add(voyageur);
				}

			// check
			CollectionTools.println("[groupingBy city] : standard", mapCityVoyageur);
			}

		// stream Collectors : groupingBy city, avec variable
			{
			Function<Voyageur, String> city = Voyageur::getCity; // classifieur de regroupement

			Map<String, List<Voyageur>> mapCityVoyageur = Arrays.stream(tabVoyageur).collect(Collectors.groupingBy(city));

			// check
			CollectionTools.println("[groupingBy city] : stream", mapCityVoyageur);
			}

		// stream Collectors : groupingBy city : sans variable
			{
			Map<String, List<Voyageur>> mapCityVoyageur = Arrays.stream(tabVoyageur).collect(Collectors.groupingBy(Voyageur::getCity));

			// check
			CollectionTools.println("[groupingBy city] : stream", mapCityVoyageur);
			}

		// Observation importante : Collectors.groupingBy
		//		- Output est une map<key,value>
		//		- La valeur de la map et une list<T> ou T est le type fournit par la stream !!!  La valeur est obtenu ici par un collector par defaut
		//		- la key de map est fournit par un classifier de type Function<T,Key>
		}


	/*------------------------------*\
	|*		value Custom Collector	*|
	\*------------------------------*/


	/**
	 * Probleme   :	Nombre de Voyageur par ville
	 *
	 * Contrainte : output dans Map avec:
	 * 						- key= ville
	 *                      - value= nombre de voyageur dans cette ville
	 */
	private static void useCollectToMap_Tuto2()
		{
		Voyageur[] tabVoyageur = VoyageurTools.create();

		CollectionTools.println("data input", tabVoyageur);

		// code standard :
			{
			Map<String, AtomicInteger> mapCityVoyageurCount = new HashMap<String, AtomicInteger>();

			for(Voyageur voyageur:tabVoyageur)
				{
				String city = voyageur.getCity();

				if (!mapCityVoyageurCount.containsKey(city))
					{
					mapCityVoyageurCount.put(city, new AtomicInteger(0));
					}

				AtomicInteger compteur = mapCityVoyageurCount.get(city); // recuperation de la value depuis la key
				compteur.incrementAndGet(); // AtomicInteger est alterable, Integer ne l'était pas!
				}

			// check
			CollectionTools.print("[groupingBy City et VoyageurCount] : standard", mapCityVoyageurCount);
			}

		// code stream : lamda dans variable
			{
			Function<Voyageur, String> city = Voyageur::getCity; // classifier
			Collector<Voyageur, ?, Long> countVoyageur = Collectors.counting();// downstream

			Map<String, Long> mapCityVoyageurCount = Arrays.stream(tabVoyageur).collect(Collectors.groupingBy(city, countVoyageur));

			// check
			CollectionTools.print("[groupingBy City et VoyageurCount] : stream", mapCityVoyageurCount);
			}

		// code stream : sans variable
			{
			Map<String, Long> mapCityVoyageurCount = Arrays.stream(tabVoyageur).collect(Collectors.groupingBy(Voyageur::getCity, Collectors.counting()));// groupingBy(key,value)

			// check
			CollectionTools.print("[groupingBy City et VoyageurCount] : stream", mapCityVoyageurCount);
			}

		}

	}
