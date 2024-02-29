import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    // Sort Integers Array from highest to lowest
    public static void main(String[] args) {
        int[] integers = getRandomIntegers(5);
        System.out.println(Arrays.toString(integers));
        int[] descendingIntegers = descendingOrder(integers);
        System.out.println(Arrays.toString(descendingIntegers));

        System.out.println("-".repeat(30));

        int[] array = getRandomIntegers(5);
        System.out.println(Arrays.toString(array));
        int[] sortedArray = sortIntegers(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRandomIntegers(int len) {
        Random random = new Random();
        int[] integers = new int[len];

        for (int i = 0; i < len; i++) {
            integers[i] = random.nextInt(1000);
        }

        return integers;
    }
    // First way
    public static int[] descendingOrder(int[] integers) {
        int[] newArray = new int[integers.length];
        Arrays.sort(integers);
        int len = integers.length - 1;
        for (int i = 0; i <= len; i++) {
            newArray[i] = integers[len - i];
        }
        return newArray;
    }

    // Second way
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
