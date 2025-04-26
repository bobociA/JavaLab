import javax.swing.*;
import java.awt.*;

public class usht2lab7 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 200, 200);
        g.fillOval(50, 50, 100, 100);  
        g.fillOval(250, 50, 100, 100); 

        g.setColor(Color.WHITE);
        g.drawString("Mickey Mouse", 160, 320);
    }

    public static void main(String[] args) {
        JFrame dritare = new JFrame("Mickey Mouse");
        dritare.setSize(400, 400);
        dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dritare.add(new usht2lab7());
        dritare.setVisible(true);
    }
}
