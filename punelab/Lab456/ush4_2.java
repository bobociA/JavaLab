import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

public class ush4_2 {
    public static void main(String[] args) {
        JFrame dritare = new JFrame("Student");
        dritare.setSize(500, 300);
        dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dritare.setLayout(new BorderLayout());

        DefaultListModel<String> modeliLista = new DefaultListModel<>();
        JList<String> lista = new JList<>(modeliLista);
        JScrollPane shirit = new JScrollPane(lista);
        dritare.add(shirit, BorderLayout.CENTER);

        JButton butonShto = new JButton("Shto nje student");
        JButton butonKerko = new JButton("Kerko nje student");
        JButton butonRendit = new JButton("Rendit studentet");

        JPanel panelButona = new JPanel();
        panelButona.add(butonShto);
        panelButona.add(butonKerko);
        panelButona.add(butonRendit);
        dritare.add(panelButona, BorderLayout.NORTH);

        butonShto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String emri = JOptionPane.showInputDialog(dritare, "Jep nje emer");
                if (emri != null && !emri.trim().isEmpty()) {
                    modeliLista.addElement(emri.trim());
                }
            }
        });

        butonKerko.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String emerKerkim = JOptionPane.showInputDialog(dritare, "Kerko me emer:");
                if (emerKerkim != null) {
                    boolean ekziston = false;
                    for (int i = 0; i < modeliLista.getSize(); i++) {
                        if (modeliLista.get(i).equalsIgnoreCase(emerKerkim.trim())) {
                            ekziston = true;
                            break;
                        }
                    }
                    if (ekziston) {
                        JOptionPane.showMessageDialog(dritare, "Studenti ekziston.");
                    } else {
                        JOptionPane.showMessageDialog(dritare, "Studenti nuk u gjet.");
                    }
                }
            }
        });

        butonRendit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> listaEmrash = new ArrayList<>();
                for (int i = 0; i < modeliLista.size(); i++) {
                    listaEmrash.add(modeliLista.getElementAt(i));
                }
                Collections.sort(listaEmrash);
                modeliLista.clear();
                for (String emri : listaEmrash) {
                    modeliLista.addElement(emri);
                }
            }
        });

        dritare.setVisible(true);
    }
}
