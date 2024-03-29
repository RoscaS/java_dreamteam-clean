
package ch.arc.cours.g_annexe.material;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HommeTools
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static Iterable<Homme> create(int n)
		{
		long seed = 1;
		Random random = new Random(seed);

		List<Homme> list = new ArrayList<Homme>(n);

		for(int i = 0; i < n; i++)
			{
			Homme homme = new Homme(random.nextInt(10), random.nextInt(100));
			list.add(homme);
			}

		return list;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
