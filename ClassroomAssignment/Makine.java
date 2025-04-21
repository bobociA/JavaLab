import java.awt.Color;
import java.awt.Graphics;

public class Makine extends ObjektQyteti {
    public Makine(int x, int y, Color ngjyra) {
        super(x, y, ngjyra);
    }

    @Override
    public void vizato(Graphics g) {
        g.setColor(ngjyra);
        g.fillRect(x, y, 50, 20);
        g.setColor(Color.BLACK);
        g.fillOval(x + 5, y + 15, 10, 10);
        g.fillOval(x + 35, y + 15, 10, 10);
    }
}
