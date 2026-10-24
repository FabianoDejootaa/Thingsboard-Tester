package view.panels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InitMenuPanel extends JPanel {

    private GridBagConstraints gbc = new GridBagConstraints();

    private JButton btnCreateDevice;

    private JTable deviceTable;
    private DefaultTableModel deviceTableModel;

    public InitMenuPanel(Dimension size) {

        super();

        super.setSize(size);
        super.setBackground(Color.DARK_GRAY);
        super.setLayout(new GridBagLayout());

        configComponents();
        insertComponents();
    }

    private void configComponents() {

        btnCreateDevice = new JButton();
        btnCreateDevice.setText("CRIAR DISPOSITIVO");
        btnCreateDevice.setFont(new Font("Cascadia Code", Font.BOLD, 20));
        btnCreateDevice.setPreferredSize(new Dimension((int)(getWidth() * 0.35f), 80));
        btnCreateDevice.setBackground(Color.WHITE);
    }

    private void insertComponents() {

        resetGbc();

        add(btnCreateDevice, gbc);

    }

    private void resetGbc() {

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0f;
        gbc.weighty = 0.0f;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0,0,0,0);
    }
}
