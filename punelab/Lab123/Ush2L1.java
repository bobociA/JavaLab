import javax.swing.JOptionPane;


public class Ush2L1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Mirsevini ne programin tone!");

        int response = JOptionPane.showConfirmDialog(null, "Deshiron te vazhdosh?", "Konfirmo", JOptionPane.YES_NO_CANCEL_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            String name = JOptionPane.showInputDialog(null, "Si quheni?");
            
            if (name != null && !name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Kenaqesi qe ju njoh, " + name + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Nuk dhate nje emer.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Programi perfundoi.");
        }
    }
}
