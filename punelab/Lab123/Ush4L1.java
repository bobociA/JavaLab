import javax.swing.JOptionPane;

public class Ush4L1 {
    public static void main(String[] args) {
        String lengthInput = JOptionPane.showInputDialog(null, "jepni gjatesin e drejtkendshit:");
        String widthInput = JOptionPane.showInputDialog(null, "jepni gjeresin e drejtkendshit:");

        try {
            double length = Double.parseDouble(lengthInput);
            double width = Double.parseDouble(widthInput);

            double area = length * width;
            double perimeter = 2 * (length + width);

            JOptionPane.showMessageDialog(null, "Siperfaqja eshte: " + area + "\nPerimetri eshte: " + perimeter);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "gabim,jepni vlera numerike te sakta.");
        }
    }
}


