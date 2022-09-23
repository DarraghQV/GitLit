package labsheet1;

import javax.swing.*;

public class Gravity {
    public static void main(String[] args) {
        String massEarthAsString = JOptionPane.showInputDialog(null,"Enter the mass of Earth:");
        String radiusEarthAsString = JOptionPane.showInputDialog(null,"Enter the radius of Earth:");
        String massOtherAsString = JOptionPane.showInputDialog(null,"Enter the mass of the other planet:");
        String radiusOtherAsString = JOptionPane.showInputDialog(null,"Enter the radius of the other planet:");

        double gravity = 9.81;
        double massEarth = Double.parseDouble(massEarthAsString);
        double radiusEarth = Double.parseDouble(radiusEarthAsString);
        double massOther = Double.parseDouble(massOtherAsString);
        double radiusOther = Double.parseDouble(radiusOtherAsString);

        double result = (gravity * massOther * radiusEarth * radiusEarth)/(massEarth * radiusOther * radiusOther);
        double resultRounded = (double)Math.round(result*100)/100;

        JOptionPane.showMessageDialog(null, "The acceleration due to gravity on the other planet is " + resultRounded +
                " n/s/s", "Acceleration", JOptionPane.INFORMATION_MESSAGE);
    }
}
