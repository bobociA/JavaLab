import javax.swing.*;
import java.awt.*;


public class ush3lab7 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillRect(50, 100, 200, 100); // Main body
        g.setColor(Color.DARK_GRAY);
        g.fillRect(200, 120, 70, 80); // Cabin
        g.setColor(Color.BLACK);
        g.fillOval(70, 190, 40, 40);  // Wheel 1
        g.fillOval(190, 190, 40, 40); // Wheel 2
        g.setColor(Color.CYAN);
        g.fillRect(210, 130, 20, 20); // Window
    }

    public static void main(String[] args) {
        JFrame dritare = new JFrame("Kamioni");
        dritare.setSize(350, 300);
        dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dritare.add(new ush3lab7());
        dritare.setVisible(true);
    }
}
