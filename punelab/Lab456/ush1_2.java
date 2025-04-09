import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ush1_2 {
    public static void main(String[] args) {
        JFrame dritare = new JFrame("Ndryshimi i shkronjave");
        dritare.setSize(400, 300);
        dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dritare.setLayout(new BorderLayout());

        JTextArea zonaTekstit = new JTextArea();
        JScrollPane shiritRrëshqitës = new JScrollPane(zonaTekstit);
        dritare.add(shiritRrëshqitës, BorderLayout.CENTER);

        JButton butonVogla = new JButton("To Lower Case");
        JButton butonMdha = new JButton("To Upper Case");

        JPanel panelButonash = new JPanel();
        panelButonash.add(butonVogla);
        panelButonash.add(butonMdha);
        dritare.add(panelButonash, BorderLayout.SOUTH);

        butonVogla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String teksti = zonaTekstit.getText();
                zonaTekstit.setText(teksti.toLowerCase());
            }
        });

        butonMdha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String teksti = zonaTekstit.getText();
                zonaTekstit.setText(teksti.toUpperCase());
            }
        });

        dritare.setVisible(true);
    }
}
