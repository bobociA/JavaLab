import javax.swing.*;
public class Ush1L2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Name&Surname field");
        

        JLabel label = new JLabel("shkruani emrin dhe mbiemrin tuaj:");
        label.setBounds(50, 20, 250, 30);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(50, 60, 200, 30);
        
        JTextField surnameField = new JTextField();
        surnameField.setBounds(50, 100, 200, 30);
        
        JButton button = new JButton("Shfaq Emrin dhe Mbiemrin");
        button.setBounds(50, 140, 200, 30);
        
        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(50, 180, 250, 30);
        
        button.addActionListener(e ->{
            String name = nameField.getText();
            String surname = surnameField.getText();
            resultLabel.setText("Emri dhe mbiemri: " + name + " " + surname);
        });
        
        frame.add(label);
        frame.add(nameField);
        frame.add(surnameField);
        frame.add(button);
        frame.add(resultLabel);
        
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
