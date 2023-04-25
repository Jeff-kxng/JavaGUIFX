package BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Layout Manger = Define the natural layout for computer within a container
        // 3 common manager
        // Borderlayout = A Borderlayout place components in five areas : North, South, West, east, center.
        // All extra space is placed in the centre area

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.GREEN);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.PINK);
        panel4.setBackground(Color.CYAN);
        panel5.setBackground(Color.ORANGE);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.EAST);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.SOUTH);
    }
}
