package animation;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyAnimation extends JPanel {
    private final Ball[] balls = new Ball[5];
    MyAnimation(int width, int height) {
        for (int i = 0; i < balls.length; i++) 
            new Thread(balls[i] = new Ball(width, height, this)).start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for (Ball ball : balls) g.fillOval(ball.x, ball.y, 30, 30);
    }
    private static class Ball implements Runnable {
        int x, y, speedX = 5, speedY = 5, maxX, maxY;
        final JPanel panel;
        Ball(int width, int height, JPanel panel) {
            maxX = width - 30; maxY = height - 30; this.panel = panel;
            x = (int) (Math.random() * maxX); y = (int) (Math.random() * maxY);
        }
        public void run() {
            while (true) {
                x += speedX; y += speedY;
                if (x > maxX || x < 0) speedX = -speedX;
                if (y > maxY || y < 0) speedY = -speedY;
                panel.repaint();
                try { Thread.sleep(50); } catch (InterruptedException ignored) {}
            }
        }
    }
}
