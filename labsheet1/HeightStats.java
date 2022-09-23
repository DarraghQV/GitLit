package labsheet1;

import javax.swing.*;

public class HeightStats {
    public static void main(String[] args) {

        int i = 1;
        double heightTotal = 0, heightAverage = 0, heightShortest = 1000;
        double Global_Average_Height = 1.665;
        double heightBetween = 0;
        double counter = 0;

        while(i < 6) {
            String heightAsString = JOptionPane.showInputDialog(null, "Please Enter height of person " + i + " in the format 0.00m");
            JOptionPane.showMessageDialog(null, "Height " + i + " is " + heightAsString);

            double height = Double.parseDouble(heightAsString);

            if (height < 0.5464 || height > 2.72)
                {
                    JOptionPane.showMessageDialog(null, "Height is invalid, please re-enter");
                    break;
                }
            else
                {
                    heightTotal += height;

                    if (height < heightShortest) heightShortest = height;

                    if (height >= 1.3 || height <= 1.9) counter++;

                    i++;
                }


        }

        heightAverage = (heightTotal / i);
        JOptionPane.showMessageDialog(null, "Height average is " + heightAverage);
        JOptionPane.showMessageDialog(null, "Shortest height is " + heightShortest);
        JOptionPane.showMessageDialog(null, "There are " + counter + " heights from 1.3m to 1.9m");
    }
}
