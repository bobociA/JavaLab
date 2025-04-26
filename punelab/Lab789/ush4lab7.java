import javax.swing.*;
import java.awt.*;

public class ush4lab7 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillRect(120, 100, 160, 160);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(180, 160, 40, 100);
        g.setColor(Color.WHITE);
        g.drawRect(130, 120, 40, 40);
        g.drawLine(150, 120, 150, 160);
        g.drawLine(130, 140, 170, 140);
        g.drawRect(230, 120, 40, 40);
        g.drawLine(250, 120, 250, 160);
        g.drawLine(230, 140, 270, 140);
    }

    public static void main(String[] args) {
        JFrame dritare = new JFrame("Shtëpia");
        dritare.setSize(400, 350);
        dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dritare.add(new ush4lab7());
        dritare.setVisible(true);
    }
}
