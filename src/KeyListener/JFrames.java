package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JFrames extends JFrame implements KeyListener {

    JLabel label;
    JFrames(){
        this.setDefaultCloseOperation(JFrames.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);

        this.add(label);
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = Invoked when a key is types, Uses KeyChar, char output

        switch (e.getKeyChar()){
            case 37 : label.setLocation(label.getX() - 10, label.getY());
            break;
            case 38 : label.setLocation(label.getX(), label.getY() -1);
            break;
            case 39 : label.setLocation(label.getX(), label.getY() + 1);
            break;
            case 40 : label.setLocation(label.getX() + 1, label.getY());
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = Invoked when a physical key is pressed down. Uses Keycode, int output

        switch (e.getKeyChar()){
            case 'a' : label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w' : label.setLocation(label.getX(), label.getY() -1);
                break;
            case 's' : label.setLocation(label.getX(), label.getY() + 1);
                break;
            case 'd' : label.setLocation(label.getX() + 1, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = called whenever a button is released
        System.out.println("You released key char : " + e.getKeyChar());

        System.out.println("You released key code : " + e.getKeyCode());
    }
}