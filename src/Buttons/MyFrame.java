package Buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    JButton button;
    MyFrame(){
        button = new JButton();
        button.setBounds(200, 100, 150, 50);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("Click the button!!!");
        button.setFocusable(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }
}
