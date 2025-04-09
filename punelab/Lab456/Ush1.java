import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ush1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JTextField inputField = new JTextField(15);
        JButton addButton = new JButton("Shto");
        JButton clearButton = new JButton("Pastro");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> nameList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(nameList);

        scrollPane.setPreferredSize(new Dimension(350, 150));

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                if (!text.isEmpty()) {
                    listModel.addElement(text);
                    inputField.setText("");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.clear();
            }
        });

        frame.add(new JLabel("Vendosni emrin:"));
        frame.add(inputField);
        frame.add(addButton);
        frame.add(scrollPane);
        frame.add(clearButton);

        frame.setVisible(true);
    }
}
