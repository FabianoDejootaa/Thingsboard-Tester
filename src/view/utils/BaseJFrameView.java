package view.utils;

import javax.swing.*;
import java.awt.*;

public abstract class BaseJFrameView extends JFrame {

    private GridBagConstraints gbc;

    public BaseJFrameView(String title, Color backgroundColor, Dimension size) {

        super();

        gbc = new GridBagConstraints();

        super.setTitle(title);
        super.setLayout(new GridBagLayout());
        super.setBackground(backgroundColor);
        super.setSize(size);
    }

    public GridBagConstraints getGbc() {

        return this.gbc;
    }
}
