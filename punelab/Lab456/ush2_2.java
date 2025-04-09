import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ush2_2 {
    public static void main(String[] args) {
        JFrame dritare = new JFrame("Tabela e studentve");
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
        dritare.setVisible(true);
    }
}
