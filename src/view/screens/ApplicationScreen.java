package view.screens;

import view.panels.InitMenuPanel;

import javax.swing.*;
import java.awt.*;

public class ApplicationScreen extends JFrame {

    private InitMenuPanel panel;

    public ApplicationScreen() {

        super();

        super.setTitle("THINGSBOARD TESTER");
        super.setSize(new Dimension(1024, 720));
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);

        configComponents();
        insertComponents();
    }

    private void configComponents() {

        panel = new InitMenuPanel(super.getSize());
    }

    private void insertComponents() {

        add(panel);
    }
}
