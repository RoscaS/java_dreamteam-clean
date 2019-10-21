
package ch.arc.cours.g_annexe.material;

public class NumberTools
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * [1,n]
	 */
	public static int[] create(int n)
		{
		int[] tab = new int[n];

		for(int i = 0; i < n; i++)
			{
			tab[i] = i + 1;
			}

		return tab;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
