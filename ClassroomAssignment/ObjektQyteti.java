import java.awt.Color;
import java.awt.Graphics;

public abstract class ObjektQyteti {
    protected int x;
    protected int y;
    protected Color ngjyra;

    public ObjektQyteti(int x, int y, Color ngjyra) {
        this.x = x;
        this.y = y;
        this.ngjyra = ngjyra;
    }

    public abstract void vizato(Graphics g);
}
