package Cwiczenia_mod_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class minki extends JComponent{
	
	private ImageIcon img = new ImageIcon("c:/DoJava/happyface.gif");
	private Timer time;
	private int x, y, w, h, panW, panH;
	private Random rand = new Random();
	private int vw=1, vh=1, vx, vy, z;
	
	public minki(int vxx, int vyy) {
		
		x = vxx - img.getIconWidth();
		y = vyy - img.getIconHeight();
		z = (1 + rand.nextInt(7));
		w = rand.nextInt(x);
		h = rand.nextInt(y);
		
		time = new Timer(30, new timeLis());
		time.start();
		System.out.println("New ball");
		
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		w = w + z*vw;
		h = h + z*vh;
		
		if(w>=x) {
			vw= -1;
		}
		if(h>=y) {
			vh = -1;
		}
		if(w<=0) {
			vw= 1;
		}
		if(h<=0) {
			vh= 1;
		}
			
	
		img.paintIcon(this, g, w, h);
		
	}
	
	
	
	public void addMinka() {
		
		
		
	}
	private class timeLis implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			//Rectangle r = getBounds();
			//vx = r.width;
			//vy = r.height;
			
			repaint();
		}
		
	}
	

}
