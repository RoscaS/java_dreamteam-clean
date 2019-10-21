
package ch.arc.cours.a_lamda.a_origine_interfacefonctionelle.actionlistener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameIntro extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameIntro()
		{
		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		// JComponent : Instanciation
		button0 = new JButton("0");
		button0Bis = new JButton("0 Bis");
		button1 = new JButton("1");
		button1bis = new JButton(" 1bis");
		button3 = new JButton("3");
		button3Bis = new JButton("3 bis");
		button4 = new JButton("4");
		button4Bis = new JButton("4 bis");
		button5 = new JButton("5");
		button5Bis = new JButton("5 bis");
		button6 = new JButton("6");
		button6Bis = new JButton("6 bis");

		// Layout : Specification
			{
			FlowLayout layout = new FlowLayout();
			setLayout(layout);
			}

		// JComponent : add
		add(button0);
		add(button0Bis);
		add(button1);
		add(button1bis);
		add(button3);
		add(button3Bis);
		add(button4);
		add(button4Bis);
		add(button5);
		add(button5Bis);
		add(button6);
		add(button6Bis);
		}

	private void control()
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Version 0
			{
			// dans variable
				{
				ActionListener actionListener = new ActionListenerSeparer();
				button0.addActionListener(actionListener);
				}

			// sans variable
			button0Bis.addActionListener(new ActionListenerSeparer());
			}


		// Version 1
			{
			// dans variable
				{
				ActionListener actionListener = new ActionListener()
					{

					@Override
					public void actionPerformed(ActionEvent e)
						{
						System.out.println("click 1");
						}
					};

				button1.addActionListener(actionListener);
				}


			// sans variable
			button1bis.addActionListener(new ActionListener()
					{

					@Override
					public void actionPerformed(ActionEvent evt)
						{
						System.out.println("click 1 bis");
						}
					});
			}


		// Versions expression lamda
			{
			// version3 (avec typage)
				{
				// dans Variable
					{
					ActionListener actionListener = (ActionEvent evt) ->{System.out.println("click 3");};

					button3.addActionListener(actionListener);
					}

				// sans variable
				button3Bis.addActionListener((ActionEvent evt) ->{System.out.println("click 3 bis");});
				}

			// verison 4 (sans typage)
				{
				// dans Variable
					{
					ActionListener actionListener = (evt) -> {System.out.println("click 4");};

					button4.addActionListener(actionListener);
					}

				// sans variable
			    button4Bis.addActionListener((evt) -> {System.out.println("click 4 bis");});
				}

			// Version 5 (sans typage light)
				{
				// dans Variable
					{
					ActionListener actionListener = evt -> {System.out.println("click 5");};

					button5.addActionListener(actionListener);
					}

				// sans variable
				button5Bis.addActionListener(evt ->{System.out.println("click 5 bis");});
				}

			// Version 6 (super light)
				{
				// dans Variable
					{
					ActionListener actionListener = evt -> System.out.println("click 6");

					button6.addActionListener(actionListener);
					}

				// sans variable
				button6Bis.addActionListener(evt -> System.out.println("click 6 bis"));
				}
			}
		}

	private void appearance()
		{
		setSize(600, 400);
		setLocationRelativeTo(null); // frame centrer
		setVisible(true); // last!
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JButton button0;
	private JButton button0Bis;
	private JButton button1;
	private JButton button1bis;
	private JButton button3;
	private JButton button3Bis;
	private JButton button4;
	private JButton button4Bis;
	private JButton button5;
	private JButton button5Bis;
	private JButton button6;
	private JButton button6Bis;

	}
