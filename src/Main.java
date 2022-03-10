import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("UwU");
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        JButton btn = new JButton("UwU");
        frame.add(btn);

        btn.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window win = new Window();
            }
        });

        while (true) {
            frame.setLocation( (int)MouseInfo.getPointerInfo().getLocation().getX() - 250, (int) MouseInfo.getPointerInfo().getLocation().getY() - 250);
            frame.toFront();
            frame.repaint();
        }
    }

}
