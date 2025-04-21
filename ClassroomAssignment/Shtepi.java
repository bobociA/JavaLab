import java.awt.Color;
import java.awt.Graphics;

public class Shtepi extends ObjektQyteti {
    public Shtepi(int x, int y, Color ngjyra) {
        super(x, y, ngjyra);
    }

    @Override
    public void vizato(Graphics g) {
        g.setColor(ngjyra);
        g.fillRect(x, y, 40, 40);
        int[] xPika = {x, x + 20, x + 40};
        int[] yPika = {y, y - 20, y};
        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(xPika, yPika, 3);
    }
}
