import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ush1L3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Num controlleer");

        JLabel label = new JLabel("jep nje numer:");
        label.setBounds(50, 20, 200, 30);

        JTextField textField = new JTextField();
        textField.setBounds(50, 60, 150, 30);

        JButton button = new JButton("Kontrollo");
        button.setBounds(50, 100, 150, 30);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(50, 140, 250, 60);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(textField.getText());
                    String evenOdd = checkEvenOdd(num);
                    String positiveNegative = checkPositiveNegative(num);
                    int absoluteValue = Math.abs(num);
                    
                    resultLabel.setText("<html>" + evenOdd + "<br>" + positiveNegative + "<br>" + 
                                        "Vlera absolute: " + absoluteValue + "</html>");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "jepni nje numer te vlefshem.");
                }
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Numri eshte cift";
        } else {
            return "Numri eshte tek";
        }
    }

    private static String checkPositiveNegative(int num) {
        if (num >= 0) {
            return "Numri eshte pozitiv";
        } else {
            return "Numri eshte negativ";
        }
    }
}
