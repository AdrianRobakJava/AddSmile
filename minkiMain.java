package Cwiczenia_mod_2;

import java.awt.*;
import javax.swing.*;

public class minkiMain {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Dużo minek");
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new minkiPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

}
