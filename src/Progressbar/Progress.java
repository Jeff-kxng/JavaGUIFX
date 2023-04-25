package Progressbar;

import javax.swing.*;
import java.awt.*;

public class Progress {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();


    Progress(){

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setForeground(Color.BLUE);
        bar.setBackground(Color.ORANGE);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    private void fill() {
        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;
        }
        bar.setString("Done !!!!");
    }

}
