import javax.swing.*;
import java.awt.event.*;

public class Ush2Lab8 {
    public static int shumezo(int a, int b) {
        if (b == 0) return 0;
        if (b > 0) return a + shumezo(a, b - 1);
        return -shumezo(a, -b);
    }

    public static void main(String[] args) {
        JFrame frm = new JFrame();
        JTextField tf1 = new JTextField(5);
        JTextField tf2 = new JTextField(5);
        JButton btn = new JButton("Shumezo");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                int vlera1 = Integer.parseInt(tf1.getText());
                int vlera2 = Integer.parseInt(tf2.getText());
                int rez = shumezo(vlera1, vlera2);
                JOptionPane.showMessageDialog(frm, "Rezultati: " + rez);
            }
        });

        frm.setLayout(new java.awt.FlowLayout());
        frm.add(new JLabel("Numri 1:"));
        frm.add(tf1);
        frm.add(new JLabel("Numri 2:"));
        frm.add(tf2);
        frm.add(btn);
        frm.pack();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
