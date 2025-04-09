import javax.swing.JOptionPane;


public class Ush3L1 {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog(null, "jepni moshen tuaj ");
        String heightInput = JOptionPane.showInputDialog(null, "jepni gjatesin tuaj ne metra ");

        try {
            int age = Integer.parseInt(ageInput);
            double heightMeters = Double.parseDouble(heightInput);
            int heightCm = (int) (heightMeters * 100);

            JOptionPane.showMessageDialog(null, "Mosha juaj esht: " + age + " vjec\nGjatesia juaj esht: " + heightCm + " cm");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Gabim! Ju lutem jepni vlera numerike te sakta");
        }
    }
}
