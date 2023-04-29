import java.util.Arrays;

public class ArrayDuplicateRemover {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int len = removeDuplicates(arr);
        System.out.println("The array with duplicates removed is: " + Arrays.toString(Arrays.copyOfRange(arr, 0, len)));
    }

    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
