package Panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JPanel = a GUI component that function as a container to hold other components
        JPanel Grepanel = new JPanel();
        Grepanel.setBackground(Color.GREEN);
        Grepanel.setBounds(0, 0, 100, 100);

        ImageIcon icon = new ImageIcon();

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(100, 0, 100, 100);

        JPanel pinkpanel = new JPanel();
        pinkpanel.setBackground(Color.PINK);
        pinkpanel.setBounds(0, 100, 200, 100);

        JLabel label = new JLabel();
        label.setText("Hey !!!");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(Grepanel);
        frame.add(bluepanel);
        frame.add(pinkpanel);
        Grepanel.add(label);
    }
}
