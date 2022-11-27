package src;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class PlatformerTutorial {
	
		public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		
		frame.setSize(700, 700);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((int) (screenSize.getWidth()/2 - frame.getSize().getWidth()/2), (int) (screenSize.getHeight()/2 - frame.getSize().getHeight()/2));
		
		frame.setResizable(false);
		frame.setTitle("Platformer Game");
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
