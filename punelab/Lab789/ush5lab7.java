
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class ush5lab7 extends JPanel {
    Random rand = new Random();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 100; i++) {
            int x1 = rand.nextInt(getWidth());
            int y1 = rand.nextInt(getHeight());
            int x2 = rand.nextInt(getWidth());
            int y2 = rand.nextInt(getHeight());
            g.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
            g.drawLine(x1, y1, x2, y2);
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame dritare = new JFrame("Screen Saver");
        dritare.setSize(500, 500);
        dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dritare.add(new ush5lab7());
        dritare.setVisible(true);
    }
}
