
package ch.arc.cours.lamda.referencemethode.tools;

import java.awt.FlowLayout;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameBouton extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameBouton(Iterable<JButton> iterableBouton,String title)
		{
		this.iterableBouton = iterableBouton;
		this.title=title;

		geometry();
		control();
		appearance();
		}

	public JFrameBouton(JButton[] tab,String title)
		{
		this(Arrays.asList(tab),title);
		}

	public JFrameBouton(JButton bouton,String title)
		{
		this(new JButton[] { bouton },title);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		// Layout : Specification
			{
			FlowLayout layout = new FlowLayout();
			setLayout(layout);
			}

		// JComponent : add
		for(JButton jButton:iterableBouton)
			{
			add(jButton);
			}
		}

	private void control()
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	private void appearance()
		{
		setTitle(title);
		setSize(400, 200);
		setLocation(random.nextInt(600),random.nextInt(600));
		setVisible(true); // last!
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Inputs
	private Iterable<JButton> iterableBouton;
	private String title;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static Random random=new Random();

	}
