import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PamjaKryesore extends JFrame {
    private JComboBox<String> comboLloji;
    private JComboBox<String> comboNgjyra;
    private JButton btnShto;
    private QytetiPanel qytetiPanel;

    private int pozitaX = 20;

    public PamjaKryesore() {
        setTitle("Pamja e Qytetit");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        qytetiPanel = new QytetiPanel();
        add(qytetiPanel, BorderLayout.CENTER);

        JPanel panelKontrolli = new JPanel();

        comboLloji = new JComboBox<>(new String[]{"Shtepi", "Makine"});
        comboNgjyra = new JComboBox<>(new String[]{"E kuqe", "Blu", "Jeshile", "E verdhë"});
        btnShto = new JButton("Shto");

        panelKontrolli.add(new JLabel("Lloji:"));
        panelKontrolli.add(comboLloji);
        panelKontrolli.add(new JLabel("Ngjyra:"));
        panelKontrolli.add(comboNgjyra);
        panelKontrolli.add(btnShto);

        add(panelKontrolli, BorderLayout.SOUTH);

        btnShto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lloji = (String) comboLloji.getSelectedItem();
                String ngjyraString = (String) comboNgjyra.getSelectedItem();
                Color ngjyra = vendosNgjyren(ngjyraString);

                int y;
                if (lloji.equals("Shtepi")) {
                    y = (pozitaX / 80) % 2 == 0 ? 200 : 100;
                    qytetiPanel.shtoObjekt(new Shtepi(pozitaX, y, ngjyra));
                } else {
                    y = qytetiPanel.getHeight() / 2 - 25;
                    qytetiPanel.shtoObjekt(new Makine(pozitaX, y, ngjyra));
                }

                pozitaX += 60;
            }
        });
    }

    private Color vendosNgjyren(String ngjyraStr) {
        Map<String, Color> ngjyraMap = new HashMap<>();
        ngjyraMap.put("E kuqe", Color.RED);
        ngjyraMap.put("Blu", Color.BLUE);
        ngjyraMap.put("Jeshile", Color.GREEN);
        ngjyraMap.put("E verdhë", Color.YELLOW);

        return ngjyraMap.getOrDefault(ngjyraStr, Color.BLACK);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PamjaKryesore().setVisible(true);
        });
    }
}
