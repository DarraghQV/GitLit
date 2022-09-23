package labsheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Enter your name:");
        String distanceCycledAsString = JOptionPane.showInputDialog(null,"Enter the Distance Cycled:");

        int distanceCycled = Integer.parseInt(distanceCycledAsString);
        double amountDue;

        if(distanceCycled > 10)
            {
                amountDue = ((distanceCycled - 10) * 2.50) + 17.50;
            }
        else {amountDue = distanceCycled * 1.75;}

        JOptionPane.showMessageDialog(null, "Name: " + name +
                "\nDistance Cycled: " + distanceCycled +
                "\nSponsorship amount due: €" + amountDue, "Receipt", JOptionPane.INFORMATION_MESSAGE);

    }
}
