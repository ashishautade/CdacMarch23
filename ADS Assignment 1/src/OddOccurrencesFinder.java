public class OddOccurrencesFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3}; // example array
        int oddOccurrence = findOddOccurrence(arr); // find the odd occurrence
        System.out.println("The number occurring the odd number of times is: " + oddOccurrence);
    }

    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }
}
