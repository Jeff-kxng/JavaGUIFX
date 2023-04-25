package ComboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFarme extends JFrame implements ActionListener {


    JComboBox comboBox;
    JFarme(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "fish", "cat"};
        comboBox = new JComboBox(animals);

       // comboBox.actionPerformed(this);
        comboBox.addActionListener(this);
        comboBox.setEditable(true);
       // System.out.println(comboBox.getItemCount());

        //comboBox.addItem("Horse");
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        comboBox.removeItemAt(0);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == comboBox){
           // System.out.println(comboBox.getSelectedItem());

            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
