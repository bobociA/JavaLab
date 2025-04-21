import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;

public class QytetiPanel extends JPanel {
    private ArrayList<ObjektQyteti> listaObjekteve;

    public QytetiPanel() {
        listaObjekteve = new ArrayList<>();
    }

    public void shtoObjekt(ObjektQyteti obj) {
        listaObjekteve.add(obj);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(java.awt.Color.GRAY);
        g.fillRect(0, getHeight() / 2 - 20, getWidth(), 40);

        for (ObjektQyteti obj : listaObjekteve) {
            obj.vizato(g);
        }
    }
}
