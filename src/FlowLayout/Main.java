package FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for component within a container
        // FlowLayout = place components in a row, size at their preferred size,
        // if the horizontal space in the container is too small
        // the Flowlayout class uses the next available row
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.BLUE);
        panel.setLayout(new FlowLayout());


        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

       /* frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9")); */


        frame.add(panel);
        frame.setVisible(true);
    }
}
