package week6;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import acmx.export.javax.swing.JComponent;

public class Movinglabel extends JComponent implements MouseListener {

	//int a; is declaring int a
	// int b = 0; initalization
	
	
	
	
	
	public Movinglabel(String labelText, int startX, int startY) {
	
	     String text = labelText;
	      int x = startX;
	      int y = startY;
	      
	addMouseListener(this);

	}

	
	public void paintComponent(Graphics g, String text, int x, int y) {
		
		g.drawString(text, x ,y);
	}
	
	
	
	
	
	

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
      int x = e.getX();
      int y = e.getY();
    	repaint();
	
	
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





}
