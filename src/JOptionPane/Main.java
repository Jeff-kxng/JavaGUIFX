package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        // JOptionPane = pop up a stand dialog box that prompts users for a value
        // or informs them of something
        //JOptionPane.showMessageDialog(null, "This is some unless infor", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some unless infor", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some unless infor", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some unless infor", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some unless infor", "title", JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "Bro, Do you have code ??", "This is even code", JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("What is your name?");
        // System.out.println("Hello !" + name);
        //JOptionPane.showOptionDialog(null, "You are awsome!!", "secret Message", JOptionPane.INFORMATION_MESSAGE);

        String[] res = {"No, You are great!!", "Thank you!", "blush"};
        JOptionPane.showOptionDialog(null, "You are awsome!!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, res, 0);

    }
}
