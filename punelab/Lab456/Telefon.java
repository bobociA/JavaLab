import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Telefon extends JFrame implements ActionListener {
    private JTextField textField;
    private StringBuilder number;

    public Telefon() {
        setTitle("Telefon");
        setSize(250, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        number = new StringBuilder();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3));

        String buttons[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        JPanel numriPanel = new JPanel();

        JLabel label = new JLabel("Numri:");
        label.setHorizontalAlignment(JLabel.CENTER);

        textField = new JTextField(10);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);

        numriPanel.add(label);
        numriPanel.add(textField);

        add(buttonPanel, BorderLayout.CENTER);
        add(numriPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();
        number.append(text);
        textField.setText(number.toString());
    }

    public static void main(String[] args) {
        new Telefon();
    }
}
