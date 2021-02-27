package javaTest;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame{
	private ImageIcon imgBackground;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
	
	private Main() {
		//container
		JPanel panel = new JPanel(new BorderLayout());
		//Layout manager
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		panel.add(new JLabel("One"));
		
		this.setTitle("Craps Test");
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

/*
//A display area for a short text string or an image, or both.
JLabel background;
//Creates an ImageIcon from the specified file.
imgBackground = new ImageIcon("src/images/GameBoard.png");
//Creates a JLabel instance with the specified image and horizontal alignment.
background = new JLabel(imgBackground, JLabel.CENTER);
//Moves and resizes this component. The new location of the top-left 
//corner is specified by x and y, and the new size is specified by
//width and height. 
background.setBounds(0,0,600,500);
add(background);
*/