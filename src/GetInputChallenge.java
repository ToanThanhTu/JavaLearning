import java.util.Scanner;

public class GetInputChallenge {

    public static void main(String[] args) {
//        sumOfFive();
        minMax();
    }

    public static void sumOfFive() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 1;

//        for (int count = 1; count <= 5; count++) {
//            int number = 0;
//            boolean validNumber = false;
//
//            do {
//                try {
//                    System.out.print("Enter number #" + count + ": ");
//                    number = Integer.parseInt(scanner.nextLine());
//                    validNumber = true;
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid number, try again.");
//                }
//            } while (!validNumber);

        while (count <= 5) {
            System.out.print("Enter number #" + count + ": ");
            String nextNumber = scanner.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                count++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }

        System.out.println("Sum = " + sum);
    }

    public static void minMax() {
        Scanner scanner = new Scanner(System.in);

        boolean isCharacter = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (!isCharacter) {
            System.out.println("Enter a number, or any character to quit.");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Quitting");
                isCharacter = true;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }

}
