import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ush3L2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sum");

        
        JLabel label1 = new JLabel("jep nje nr:");
        label1.setBounds(50, 20, 200, 30);

        JTextField textField1 = new JTextField();
        textField1.setBounds(50, 60, 150, 30);

        JLabel label2 = new JLabel("Shuma:");
        label2.setBounds(50, 100, 200, 30);

        JTextField textField2 = new JTextField();
        textField2.setBounds(50, 140, 150, 30);
        textField2.setEditable(false);  

        JButton button = new JButton("Enter");
        button.setBounds(50, 180, 150, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value = Double.parseDouble(textField1.getText());
                    double sum = value + value; 
                    textField2.setText(String.valueOf(sum)); 
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ju lutem jepni nje nr.");
                }
            }
        });

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(button);

        frame.setSize(250, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
