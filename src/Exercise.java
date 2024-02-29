import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        int[] array = {23, 43, 5623, 11, 23345, 1, 0, 3, 45, 34};
        int[] reversed = reverse(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversed));

        reverse2(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        int maxIndex = array.length - 1;

//        for (int i = 0; i <= maxIndex; i++) {
//            reversed[i] = array[maxIndex - i];
//        }

        for (int e : array) {
            reversed[maxIndex--] = e;
        }

        return reversed;
    }

    private static void reverse2(int[] array) {
        int temp;
        int maxIndex = array.length - 1;
        for (int i = 0; i <= maxIndex/2; i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

}
