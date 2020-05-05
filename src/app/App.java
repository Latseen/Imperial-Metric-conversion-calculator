package app;

import javax.swing.JOptionPane;

class convert {
    private static String convertTo;
    private static final String TITLE = "Measurement Converter";
    private static final String OPTIONS = "What do you want to convert?";

    public static void main(String[] args) {
        double convert;
        String[] options = { "Centimeters to Inches", "Inches to Centimeters", "Centimeters to Feet",
                "Inches to Meters" };
        convertTo = (String) JOptionPane.showInputDialog(null, OPTIONS, TITLE, JOptionPane.QUESTION_MESSAGE, null,
                options, options);
        testForCancel(convertTo);

        if (convertTo.equals("Centimeters to Inches")) {
            String centimeters = JOptionPane.showInputDialog(null, "Enter number of centimeters: ", TITLE,
                    JOptionPane.QUESTION_MESSAGE);
            testForCancel(centimeters);
            convert = Double.parseDouble(centimeters);
            double inches = centToInch(convert);
            String convert1 = Double.toString(inches);
            JOptionPane.showMessageDialog(null, "Inches: " + convert1, TITLE, JOptionPane.INFORMATION_MESSAGE);
        }
        else if (convertTo.equals("Inches to Centimeters")) {
            String inches = JOptionPane.showInputDialog(null, "Enter number of inches: ", TITLE,
                    JOptionPane.QUESTION_MESSAGE);
            testForCancel(inches);
            convert = Double.parseDouble(inches);
            double centimeters = inchToCent(convert);
            String convert1 = Double.toString(centimeters);
            JOptionPane.showMessageDialog(null, "Centimeters: " + convert1, TITLE, JOptionPane.INFORMATION_MESSAGE);
        }
        else if (convertTo.equals("Centimeters to Feet")) {
            String centimeters = JOptionPane.showInputDialog(null, "Enter number of centimeters: ", TITLE,
                    JOptionPane.QUESTION_MESSAGE);
            testForCancel(centimeters);
            convert = Double.parseDouble(centimeters);
            double feet = centToFeet(convert);
            String convert1 = Double.toString(feet);
            JOptionPane.showMessageDialog(null, "Feet: " + convert1, TITLE, JOptionPane.INFORMATION_MESSAGE);
        }
        else if (convertTo.equals("Inches to Meters")) {
            String inches = JOptionPane.showInputDialog(null, "Enter number of inches: ", TITLE,
                    JOptionPane.QUESTION_MESSAGE);
            testForCancel(inches);
            convert = Double.parseDouble(inches);
            double meters = inchToMeter(convert);
            String convert1 = Double.toString(meters);
            JOptionPane.showMessageDialog(null, "Meters: " + convert1, TITLE, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static double centToInch(double centimeters) {
        double inches = centimeters / 2.54;
        return inches;
    }

    public static double inchToCent(double inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }

    public static double centToFeet(double centimeters) {
        double feet = centToInch(centimeters) / 12;
        return feet;
    }

    public static double inchToMeter(double inch) {
        double Meters = inchToCent(inch) / 100;
        return Meters;
    }

    private static void testForCancel(String input) {
        if (input == null) {
            System.exit(0);
        }
    }
}