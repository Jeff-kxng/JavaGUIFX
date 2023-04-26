package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class myJframe extends JFrame implements MouseListener {
    JLabel label;

    myJframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);
        this.addMouseListener(this);

        this.add(label);
        this.setLayout(null);
        this.setVisible(true);

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has checked (pressed and released) on a computer
        //System.out.println("You click the mouse");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        //System.out.println("You press the mouse !!!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse exist a component
        System.out.println("You released the mouse :D !!!");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when a mouse
        System.out.println("You Enter the mouse :D !!!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You Existed the mouse :D !!!");
    }
}
