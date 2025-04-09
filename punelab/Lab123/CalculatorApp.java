import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator i thjeshtë");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new FlowLayout());

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JButton sumButton = new JButton("Shuma");
        JButton multiplyButton = new JButton("Prodhimi");
        JLabel resultLabel = new JLabel("Rezultati:");

        panel.add(new JLabel("Numri 1:"));
        panel.add(textField1);
        panel.add(new JLabel("Numri 2:"));
        panel.add(textField2);
        panel.add(sumButton);
        panel.add(multiplyButton);
        panel.add(resultLabel);

        frame.setVisible(true);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double sum = num1 + num2;
                    resultLabel.setText("Shuma: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Gabim në input!");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double product = num1 * num2;
                    resultLabel.setText("Prodhimi: " + product);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Gabim në input!");
                }
            }
        });
    }
}

