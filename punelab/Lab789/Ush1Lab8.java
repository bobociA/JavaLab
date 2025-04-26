import javax.swing.*;
import java.awt.event.*;

public class Ush1Lab8 {
    public static boolean eshtePalindrom(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return eshtePalindrom(s, i + 1, j - 1);
    }

    public static void main(String[] args) {
        JFrame frm = new JFrame();
        JTextField tf = new JTextField(20);
        JButton btn = new JButton("Kontrollo");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String tekst = tf.getText();
                boolean rez = eshtePalindrom(tekst, 0, tekst.length() - 1);
                if (rez) {
                    JOptionPane.showMessageDialog(frm, "Po");
                } else {
                    JOptionPane.showMessageDialog(frm, "Jo");
                }
            }
        });

        frm.setLayout(new java.awt.FlowLayout());
        frm.add(new JLabel("Fut tekstin:"));
        frm.add(tf);
        frm.add(btn);
        frm.pack();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
