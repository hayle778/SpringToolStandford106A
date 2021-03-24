package week6;

import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acmx.export.javax.swing.JFrame;
import acmx.export.javax.swing.JLabel;

public class Week7 extends ConsoleProgram{

	
	
	public static void main(String[]args) {
	
		
		
		JFrame frame = new JFrame("Graphical Hello");
		
		
		
		JLabel lebel = new JLabel("Hello World!", JLabel.CENTER);
		
		frame.add(lebel);
		frame.setSize(500, 300);
		//frame.setName(lebel);
		
		
	//	frame.setDefault(laseOperation(JFrame.EXIT_ON_CLOSE));
        frame.setVisible(true);
	
	}













}
