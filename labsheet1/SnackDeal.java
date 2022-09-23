package labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Enter your name:");
        String course = JOptionPane.showInputDialog(null,"Enter your course:");
        String snackAmountAsString = JOptionPane.showInputDialog(null,"How many snacks would you like?");

        int snackAmount = Integer.parseInt(snackAmountAsString);

        int snackPrice = 2;
        int cost = snackPrice * snackAmount;

        JOptionPane.showMessageDialog(null, "Name: " + name +
                "\nCourse: " + course + "\nSnacks: " + snackAmount + "\nCost: €" + cost);

    }
}
