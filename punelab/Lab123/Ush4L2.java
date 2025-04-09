import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ush4L2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Koordinatat e Mausit");
        JLabel labelX = new JLabel("Koordinata X:");
        labelX.setBounds(50, 20, 100, 30);

        JTextField textFieldX = new JTextField();
        textFieldX.setBounds(150, 20, 100, 30);
        textFieldX.setEditable(false);

        JLabel labelY = new JLabel("Koordinata Y:");
        labelY.setBounds(50, 60, 100, 30);

        JTextField textFieldY = new JTextField();
        textFieldY.setBounds(150, 60, 100, 30);
        textFieldY.setEditable(false); 
        frame.add(labelX);
        frame.add(textFieldX);
        frame.add(labelY);
        frame.add(textFieldY);

        frame.setSize(300, 150);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                textFieldX.setText(String.valueOf(x));
                textFieldY.setText(String.valueOf(y));
            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }
        });

        frame.setVisible(true);
    }
}
