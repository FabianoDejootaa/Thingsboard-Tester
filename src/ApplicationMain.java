import view.screens.ApplicationScreen;

import javax.swing.*;

public class ApplicationMain {

    public static void main(String args[]) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                ApplicationScreen appScreen = new ApplicationScreen();

                appScreen.setVisible(true);
            }
        });
    }
}