package animation;

import java.awt.Color;
import javax.swing.JFrame;

public class Animation extends JFrame {

	Animation(){
		setSize(800,600);
		setTitle("Graphic Programming");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		MyAnimation panel=new MyAnimation(780,560);
		panel.setBackground(Color.black);
		add(panel);
	}
	
	public static void main(String[] args) {

		new Animation().setVisible(true);
	}
}
