package Radiobuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFarme extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    MyFarme() {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamberger");
        hotdogButton = new JRadioButton("HotDog");

       ButtonGroup buttonGroup = new ButtonGroup();
       buttonGroup.add(pizzaButton);
       buttonGroup.add(hamburgerButton);
       buttonGroup.add(hotdogButton);

       pizzaButton.addActionListener(this);
       hamburgerButton.addActionListener(this);
       hotdogButton.addActionListener(this);


      // this.add(buttonGroup);
       this.add(pizzaButton);
       this.add(hamburgerButton);
       this.add(hotdogButton);
       this.pack();
       this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == pizzaButton){
            System.out.println("You are Pizza!!!");
        } else if (e.getSource() == hamburgerButton){
            System.out.println("You are Hamburger!!");
        } else {
            System.out.println("You are HotDog!!!");
        }
    }
}
