import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Window {

    public Window() {
        JFrame frame = new JFrame("UwU");
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        Random r = new Random();
        int low = 0;
        int high = 2080;
        int result = r.nextInt(high-low) + low;

        Random r2 = new Random();
        int low2 = 0;
        int high2 = 1500;
        int result2 = r.nextInt(high-low) + low;

        frame.setLocation(result, result2);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        JButton btn = new JButton("UwU");
        frame.add(btn);

        btn.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window win = new Window();
            }
        });
    }

}
