package animation;

import javax.swing.JFrame;

public class Animation extends JFrame {
    public Animation() {
        setSize(800, 600);
        setTitle("Animated Shapes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        MyAnimation panel = new MyAnimation(780, 560);
        add(panel);
    }
    
    public static void main(String[] args) {
        new Animation().setVisible(true);
    }
}
