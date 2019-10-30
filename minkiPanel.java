package Cwiczenia_mod_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class minkiPanel extends JPanel{
	
	private Dimension dim = new Dimension(500, 600);
	private JPanel downPanel = new JPanel();
	private JPanel upPanel = new JPanel();
	private minki minka;
	private JButton but = new JButton("Dodaj minkę");
	private Random rand = new Random();
	private int w, h, x, y, vx, vy;
	
	
	public minkiPanel(){
		
		this.setBackground(Color.white);
		this.setPreferredSize(dim);
		
		
		//downPanel.setLayout(new BorderLayout());
		downPanel.setBackground(Color.yellow);
		downPanel.setPreferredSize(new Dimension(dim.width, dim.height/6));
		upPanel.setBackground(Color.LIGHT_GRAY);
		upPanel.setPreferredSize(new Dimension(dim.width, (5*dim.height)/6));
		but.setFont(new Font("Arial", Font.PLAIN, 24));
		but.addActionListener(new butLis());
		downPanel.add(but);
		upPanel.setLayout(new BorderLayout());
		
		
		this.add(upPanel);
		this.add(downPanel);
		
	}
	
	private class butLis implements ActionListener{

		
		public void actionPerformed(ActionEvent ev) {
			Rectangle r = upPanel.getBounds();
			vx = r.width;
			vy = r.height;
			
			
			minka = new minki(vx, vy);
			upPanel.add(minka);
			
			System.out.println("Nowa minka dodana");
			revalidate();
			repaint();
		}
		
	}
	
	

}
