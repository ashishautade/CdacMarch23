
import java.util.*;

public class DuplicateFinderinArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 1, 7, 3, 2};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println("The duplicate numbers are: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) > 1) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
