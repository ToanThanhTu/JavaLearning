import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge2 {
    public static void main(String[] args) {
        int[] arrays = readIntegers();
        System.out.println(Arrays.toString(arrays));

        int min = findMin(arrays);
        System.out.println("Minimum Element: " + min);
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String[] splitNumbers = scanner.nextLine().split(",");
        int[] array = new int[splitNumbers.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(splitNumbers[i].trim());
        }

        return array;
    }

    private static int findMin(int[] array) {
        // First way
//        Arrays.sort(array);
//        return array[0];

        // Second way
        int min = Integer.MAX_VALUE;

        for (int n : array) {
            if (n < min) {
                min = n;
            }
        }

        return min;
    }
}
