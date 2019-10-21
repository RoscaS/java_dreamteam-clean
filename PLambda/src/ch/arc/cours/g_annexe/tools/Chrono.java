
package ch.arc.cours.g_annexe.tools;

public class Chrono
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Chrono()
		{
		start();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		stop();
		long deltaT = arret - depart;
		return deltaT + " [ms]";
		}

	public void start()
		{
		isRunning = true;
		depart = System.currentTimeMillis();
		}

	public void stop()
		{
		if (isRunning)
			{
			arret = System.currentTimeMillis();
			isRunning = false;
			}
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public long getTime()
		{
		stop();

		return arret - depart;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private long depart;
	private long arret;
	private boolean isRunning;

	}

