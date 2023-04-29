import java.util.HashMap;
import java.util.Map;

public class PairSumFinder {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 6, 2, 7};
        int sum = 9;
        findPairs(arr, sum);
    }

    public static void findPairs(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("(" + complement + ", " + arr[i] + ")");
            }
            map.put(arr[i], i);
        }
    }
}
