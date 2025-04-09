import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ush2 {
    private JTextField numField1, numField2;
    private JTextArea historyArea;
    private double num1, num2, result;

    public Ush2() {
        JFrame frame = new JFrame();
        frame.setTitle("Makine Llogaritese");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel titleLabel = new JLabel("Makine Llogaritese");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(titleLabel, gbc);

        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        numField1 = new JTextField(5);
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(numField1, gbc);

        numField2 = new JTextField(5);
        gbc.gridx = 1;
        frame.add(numField2, gbc);

        String[] operators = {"+", "-", "*", "/"};
        for (int i = 0; i < operators.length; i++) {
            JButton button = new JButton(operators[i]);
            gbc.gridx = i + 2;
            frame.add(button, gbc);
            button.addActionListener(new OperatorListener());
        }

        historyArea = new JTextArea(8, 30);
        historyArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(historyArea);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 6;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(scrollPane, gbc);

        JButton clearButton = new JButton("Pastro");
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        frame.add(clearButton, gbc);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                historyArea.setText("");
            }
        });

        frame.setVisible(true);
    }

    private class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                num1 = Double.parseDouble(numField1.getText());
                num2 = Double.parseDouble(numField2.getText());
                String operator = ((JButton) e.getSource()).getText();

                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if (num2 != 0) result = num1 / num2;
                        else {
                            historyArea.append("Gabim: Nuk pjestohen me zero!\n");
                            return;
                        }
                        break;
                }
                historyArea.append(num1 + " " + operator + " " + num2 + " = " + result + "\n");
            } catch (NumberFormatException ex) {
                historyArea.append("Gabim: Ju lutem vendosni numra të vlefshëm!\n");
            }
        }
    }

    public static void main(String[] args) {
        new Ush2();
    }
}
