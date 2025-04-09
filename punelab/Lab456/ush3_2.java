import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class ush3_2 {
    public static void main(String[] args) {
        JFrame dritare = new JFrame("Kliko");
        dritare.setSize(400, 200);
        dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] kolonat = {"ID Student", "Emri", "Mbiemri"};
        Object[][] teDhenat = {
            {"1", "Anxhela", "Boboçi"},
            {"2", "Emer2", "Mbiemer2"},
            {"3", "Emer3", "Mbiemer3"}
        };

        JTable tabela = new JTable(new DefaultTableModel(teDhenat, kolonat));
        JScrollPane shirit = new JScrollPane(tabela);
        dritare.add(shirit);

        tabela.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int rreshti = tabela.getSelectedRow();
                int kolona = tabela.getSelectedColumn();
                if (rreshti != -1 && kolona != -1) {
                    Object vlera = tabela.getValueAt(rreshti, kolona);
                    JOptionPane.showMessageDialog(dritare, "Vlera: " + vlera.toString());
                }
            }
        });

        dritare.setVisible(true);
    }
}
