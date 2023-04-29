public class MissingNumberFinder {
    public static void main(String[] args) {
        // create the array with the missing number
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            if (i == 42) {
                continue; // skip the number 43 (index 42)
            }
            arr[i] = i + 1;
        }

        // find the missing number using the formula approach
        int expectedSum = 100 * (100 + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;

        // output the missing number
        System.out.println("The missing number is: " + missingNumber);
    }
}
