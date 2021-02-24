package jFrameTutorial;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//What is extends?
//What is implements?
public class Main extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		//Why create a Main?
		new Main().setVisible(true);
	}
	//Private constructor
	private Main() {
		//What is super?
		super("Tutorial");
		//width, height
		setSize(600,600);
		setResizable(false);
		//Exit window
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(5,5));
		/*
		 * ...
		 * FlowLayout
		 * GridBagLayout
		 * GridLayour
		 * BorderLayout 
		 * ...etc
		 */
		
		JButton button = new JButton("Click Me");
		button.setActionCommand("click");
		JButton button2 = new JButton("Button 2");
		button2.setActionCommand("button");
		//Passes the main object, since it  implements
		//ActionListener it is basically "this"
		button.addActionListener(this);
		button2.addActionListener(this);
		
		//Added to the window
		add(button);
		add(button2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(name.equals("click")) {
			System.out.println("Click Me!");
		} else if (name.equals("button")) {
			System.out.println("Button2 has been clicked");
		}
	}

}



