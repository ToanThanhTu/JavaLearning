public class OverloadingMethodChallenge {
    public static void main(String[] args) {
        int feet = 5;
        int inches = 8;
        System.out.println(feet + " ft " + inches + " in = "
                + convertToCentimeters(feet, inches) + " cm.");
    }

    public static double convertToCentimeters(int heightInches) {
        return (double) heightInches*2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int heightInches = (feet * 12) + inches;
        return convertToCentimeters(heightInches);
    }
}
