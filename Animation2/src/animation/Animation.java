package animation;

import java.awt.Color;
import javax.swing.JFrame;

public class Animation extends JFrame {
    Animation() {
        setSize(800, 600);
        setTitle("Multithreaded Bouncing Balls");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        MyAnimation panel = new MyAnimation(700, 500); // Create panel with custom size
        panel.setBackground(Color.BLACK); // Set background color
        add(panel);
    }

    public static void main(String[] args) {
        new Animation().setVisible(true); // Launch the animation
    }
}



