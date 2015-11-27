package awt;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {


	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JLabel hi = new JLabel("Hola");
		frame.getContentPane().add(hi, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
