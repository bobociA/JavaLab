import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ush2Lab9 {
    static class Figure {
        double a, b, c;
        public Figure(double a, double b, double c) {
            this.a = a; this.b = b; this.c = c;
        }
        public double perimetri(int tipi) {
            switch (tipi) {
                case 1: return 2 * Math.PI * a;
                case 2: return 2 * (a + b);
                case 3: return a + b + c;
                default: return 0;
            }
        }
        public boolean eshteTrekendesh() {
            return a + b > c && a + c > b && b + c > a;
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Sa figura do te futen?"));
        int tipi = Integer.parseInt(JOptionPane.showInputDialog("Zgjidh (1) Rreth, (2) Drejtkendesh, (3) Trekendesh"));
        List<Figure> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (tipi == 1) {
                double r = Double.parseDouble(JOptionPane.showInputDialog("Rrezja:"));
                lista.add(new Figure(r, 0, 0));
            } else if (tipi == 2) {
                double g1 = Double.parseDouble(JOptionPane.showInputDialog("Gjatesia:"));
                double g2 = Double.parseDouble(JOptionPane.showInputDialog("Gjeresia:"));
                lista.add(new Figure(g1, g2, 0));
            } else {
                double x = Double.parseDouble(JOptionPane.showInputDialog("Brinja 1:"));
                double y = Double.parseDouble(JOptionPane.showInputDialog("Brinja 2:"));
                double z = Double.parseDouble(JOptionPane.showInputDialog("Brinja 3:"));
                Figure f = new Figure(x, y, z);
                if (!f.eshteTrekendesh()) {
                    JOptionPane.showMessageDialog(null, "Vlerat nuk formojne trekendesh!");
                    i--;
                    continue;
                }
                lista.add(f);
            }
        }
        Figure maxF = lista.get(0);
        for (Figure f : lista) {
            if (f.perimetri(tipi) > maxF.perimetri(tipi)) {
                maxF = f;
            }
        }
        JOptionPane.showMessageDialog(
            null,
            "Figura me perimetrin me te madh ka perimeter = " + maxF.perimetri(tipi)
        );
    }
}
