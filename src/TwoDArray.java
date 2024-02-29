import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }
        System.out.println("-".repeat(30));

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                array2[i][j] = (i * 10) + (j + 1);
            }
        }

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }
        System.out.println("-".repeat(30));

        for (var outer : array2) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(30));
        System.out.println(Arrays.deepToString(array2));
        System.out.println("=".repeat(100));

        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));
    }
}
