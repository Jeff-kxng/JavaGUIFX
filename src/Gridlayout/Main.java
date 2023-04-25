package Gridlayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Layout = Define the natural layout for component within a container
        // GridLayout = place components in a grid of cell
        // Each component takes all the avaiable space with its cell
        // and each the same size
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        // frame.setVisible(true);
        frame.setLayout(new GridLayout(3, 3, 10, 0));


       /* JButton button = new JButton();
        frame.add(button); */
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);
    }
}
