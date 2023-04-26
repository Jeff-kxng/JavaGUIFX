package Colorchooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrames extends JFrame implements ActionListener {


    JButton button;
    JLabel label;
    JFrames(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.setText("This is some Text :D !!!!!");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));


        this.add(label);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color ....... I guess", Color.BLUE);

            label.setForeground(color);
            label.setBackground(color);
        }

    }
}
