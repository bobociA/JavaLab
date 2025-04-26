import javax.swing.*;
import java.awt.event.*;

public class Ush3Lab8 {
    public static void anagramat(String s, String kerko, JTextArea txtRez) {
        if (s.length() == 0) {
            txtRez.append(kerko + "\n");
        } else {
            for (int i = 0; i < s.length(); i++) {
                String pjesaEmbetur = s.substring(0, i) + s.substring(i + 1);
                anagramat(pjesaEmbetur, kerko + s.charAt(i), txtRez);
            }
        }
    }
    public static void main(String[] args) {
        JFrame frm = new JFrame();
        JTextField tf = new JTextField(20);
        JTextArea ta = new JTextArea(10, 20);
        JButton btn = new JButton("Gjej Anagramat");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ta.setText("");
                anagramat(tf.getText(), "", ta);
            }
        });

        frm.setLayout(new java.awt.FlowLayout());
        frm.add(new JLabel("Fut tekstin:"));
        frm.add(tf);
        frm.add(btn);
        frm.add(new JScrollPane(ta));
        frm.pack();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
