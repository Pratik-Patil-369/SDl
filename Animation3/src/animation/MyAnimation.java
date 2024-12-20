package animation;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyAnimation extends JPanel {
    private final Shape[] shapes = new Shape[5];
    public MyAnimation(int width, int height) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = new Shape(width, height, this);  
            new Thread(shapes[i]).start(); 
        }
    }
     protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            g.setColor(Color.RED); 

            if (shape.type == 0) { 
                g.fillOval(shape.x, shape.y, 30, 30);  
            } else if (shape.type == 1) {  
                g.fillRect(shape.x, shape.y, 30, 50);  
            } else if (shape.type == 2) { 
                g.fillRect(shape.x, shape.y, 30, 30); 
            }
        }
    }
    private static class Shape implements Runnable {
        int x, y, speedX = 5, speedY = 5, maxX, maxY, type;
        final JPanel panel;
        Shape(int width, int height, JPanel panel) {
            maxX = width - 30; 
            maxY = height - 30;
            this.panel = panel;
            x = (int) (Math.random() * maxX);  
            y = (int) (Math.random() * maxY);  
            type = (int) (Math.random() * 3);  
        }
        public void run() {
            while (true) {
                x += speedX;
                y += speedY;
                if (x > maxX || x < 0) speedX = -speedX;  
                if (y > maxY || y < 0) speedY = -speedY; 
                panel.repaint(); 
                try { Thread.sleep(50); } catch (InterruptedException ignored) {}
            }
        }
    }
}
