package animation;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;

public class MyAnimation extends JPanel {
	int x=0;
	int y=0;
	int ballWidth=50;
	int ballHeight=50;
	int max_x, max_y;
	int speedx=10;
	int speedy=10;
	MyAnimation(int w, int h){
		this.max_x=w-ballWidth;
		this.max_y=h-ballHeight;
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(x, y, ballWidth, ballHeight);
		
		if(x>max_x || x<0)
			speedx=-speedx;
		if(y>max_y || y<0)
			speedy=-speedy;
		x=x+speedx;
		y=y+speedy;
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		repaint();
	}
}



