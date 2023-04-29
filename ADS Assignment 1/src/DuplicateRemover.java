import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 1, 7, 3, 2};
        int[] newArr = removeDuplicates(arr);
        System.out.println("The array without duplicates is: " + Arrays.toString(newArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] newArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            newArr[i++] = num;
        }
        return newArr;
    }
}
