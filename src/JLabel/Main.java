package JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static java.awt.Color.GREEN;
import static java.awt.Color.green;

public class Main {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image. or both
        ImageIcon icon = new ImageIcon("\"D:\\mqqw2f2l.png\"");
        Border border = BorderFactory.createLineBorder(GREEN,5);
        JLabel label = new JLabel(icon);
        label.setText("Hey, Have you code JavaFX");
        label.setIcon(icon);
        Image image = icon.getImage();
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);//set text Top one the image add
        label.setForeground(new Color(0x000FF0)); // set font color text
       //  label.setFont(new Font());
        label.setIconTextGap(100); // set gap of text to image
        label.setBackground(Color.PINK); // set background color
        label.setOpaque(true); // Display BAckground color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100, 100, 0, 0); // set x, y position within frame well as dimensions
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
