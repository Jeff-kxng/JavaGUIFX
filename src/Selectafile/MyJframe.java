package Selectafile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyJframe extends JFrame implements ActionListener {

    JButton button;

    MyJframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select Files");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(""));
          //  fileChooser.showOpenDialog(null); // select file to open
            //  System.out.println(fileChooser.showOpenDialog(null));
            //int res = fileChooser.showOpenDialog(null);
            int res = fileChooser.showSaveDialog(null);
            if (res == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsoluteFile().toURI());
                System.out.println(file);
            }
        }
    }
}
