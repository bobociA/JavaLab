import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ush3Lab9 {
    static class Klient {
        String emri;
        double oferta;
        public Klient(String emri, double oferta) {
            this.emri = emri;
            this.oferta = oferta;
        }
    }

    static class Prona {
        String emriPrones;
        List<Klient> listaKlientesh = new ArrayList<>();
        public Prona(String emriPrones) {
            this.emriPrones = emriPrones;
        }
        public void shtoKlient(Klient k) {
            listaKlientesh.add(k);
        }
        public int numroKliente() {
            return listaKlientesh.size();
        }
        public Klient ofertaMaks() {
            Klient max = listaKlientesh.get(0);
            for (Klient k : listaKlientesh) {
                if (k.oferta > max.oferta) {
                    max = k;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        String emriPr = JOptionPane.showInputDialog("Emri i prones:");
        Prona p = new Prona(emriPr);
        while (true) {
            String v = JOptionPane.showInputDialog(
                "1: Shto klient\n" +
                "2: Numero kliente\n" +
                "3: Oferta maksimale\n" +
                "0: Dil"
            );
            if (v == null || v.equals("0")) {
                System.exit(0);
            }
            switch (v) {
                case "1":
                    String emriKl = JOptionPane.showInputDialog("Emri i klientit:");
                    double of = Double.parseDouble(JOptionPane.showInputDialog("Oferta ():"));
                    p.shtoKlient(new Klient(emriKl, of));
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Numer klientesh: " + p.numroKliente());
                    break;
                case "3":
                    if (p.listaKlientesh.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nuk ka kliente.");
                    } else {
                        Klient km = p.ofertaMaks();
                        JOptionPane.showMessageDialog(
                            null,
                            "Klienti me oferten me te madhe:\n" +
                            km.emri + " - " + km.oferta + ""
                        );
                    }
                    break;
            }
        }
    }
}
