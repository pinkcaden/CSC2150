import java.util.Arrays;

public class SwapLastN {

    /*
        TASK: Write the body of the method, swapLastN, that will swap the
        last "n" places in an array. For example, the array is [5, 9, 22, 2, 4]
        and n=2, after swapping the last "n" places, the modified arrays
        is, [4, 2, 22, 9, 5].
     */


    private static void swapLastN(int[] array, int n) {
        int size = array.length;
        for (int i = 0; i < n; i++) {
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 9, 22, 2, 4};
        System.out.println("Original Array: " + Arrays.toString(array));
        swapLastN(array, 2);
        System.out.println("Modified Array: " + Arrays.toString(array));
    }
}
