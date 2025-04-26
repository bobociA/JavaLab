import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ush1Lab9 {
    static class Libri {
        String autor;
        String titull;
        String numriSerial;
        int nrFaqeve;
        String lloji;
        double cmimi;

        public Libri(String autor, String titull, String numriSerial, int nrFaqeve, String lloji, double cmimi) {
            this.autor = autor;
            this.titull = titull;
            this.numriSerial = numriSerial;
            this.nrFaqeve = nrFaqeve;
            this.lloji = lloji;
            this.cmimi = cmimi;
        }

        @Override
        public String toString() {
            return String.format("%s – \"%s\" (Serial: %s), %d faqe, %s, %.2f€",
                    autor, titull, numriSerial, nrFaqeve, lloji, cmimi);
        }
    }

    static List<Libri> listaLibrave = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String s = JOptionPane.showInputDialog(
                "Menaxhim Librash:\n" +
                "1: Shfaq te gjithe librat\n" +
                "2: Kerko liber me numer serial\n" +
                "3: Shto liber te ri\n" +
                "4: Hiq liber me numer serial\n" +
                "0: Dil"
            );
            if (s == null || s.equals("0")) {
                System.exit(0);
            }

            switch (s) {
                case "1":
                    if (listaLibrave.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nuk ka libra ne liste.");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (Libri L : listaLibrave) {
                            sb.append(L).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;

                case "2":
                    String serialKerko = JOptionPane.showInputDialog("Numer serial per kerkim:");
                    if (serialKerko != null) {
                        boolean gjetur = false;
                        for (Libri L : listaLibrave) {
                            if (L.numriSerial.equals(serialKerko)) {
                                JOptionPane.showMessageDialog(null, L);
                                gjetur = true;
                                break;
                            }
                        }
                        if (!gjetur) {
                            JOptionPane.showMessageDialog(null, "Nuk u gjet libër me serial " + serialKerko);
                        }
                    }
                    break;

                case "3":
                    String autor = JOptionPane.showInputDialog("Autor:");
                    String titull = JOptionPane.showInputDialog("Titull:");
                    String serial = JOptionPane.showInputDialog("Numër serial:");
                    int nrFaqe = Integer.parseInt(JOptionPane.showInputDialog("Numër faqesh:"));
                    String lloji = JOptionPane.showInputDialog("Lloji:");
                    double cmimi = Double.parseDouble(JOptionPane.showInputDialog("Çmimi (€):"));
                    listaLibrave.add(new Libri(autor, titull, serial, nrFaqe, lloji, cmimi));
                    break;

                case "4":
                    String serialHiq = JOptionPane.showInputDialog("Numër serial për heqje:");
                    if (serialHiq != null) {
                        listaLibrave.removeIf(L -> L.numriSerial.equals(serialHiq));
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
