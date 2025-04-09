import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ush2L2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Count");

        JLabel label = new JLabel("kliklo butonin per te rritur vleren:");
        label.setBounds(50, 20, 250, 30);

        JTextField textField = new JTextField("0");
        textField.setBounds(50, 60, 100, 30);

        JButton button = new JButton("Rrit Vlerën");
        button.setBounds(50, 100, 150, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(textField.getText());
                currentValue++;
                textField.setText(String.valueOf(currentValue));
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(250, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
