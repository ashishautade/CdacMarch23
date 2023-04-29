import java.util.*;

public class ArrayPairSumFinder {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int sum = 7;
        List<List<Integer>> pairs = findPairsWithSum(arr, sum);
        System.out.println("Pairs with sum " + sum + " are: " + pairs.toString());
    }

    public static List<List<Integer>> findPairsWithSum(int[] arr, int sum) {
        List<List<Integer>> pairs = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];
            if (seen.contains(complement)) {
                List<Integer> pair = Arrays.asList(arr[i], complement);
                pairs.add(pair);
            }
            seen.add(arr[i]);
        }
        return pairs;
    }
}
