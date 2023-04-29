import java.util.Arrays;

public class ClosestToZeroPairFinder {
    public static void main(String[] args) {
        int[] arr = {1, 5, -3, 8, -6, 2, -7};
        int[] closestPair = findClosestToZeroPair(arr);
        System.out.println("The closest pair to zero is: {" + closestPair[0] + ", " + closestPair[1] + "}");
    }

    public static int[] findClosestToZeroPair(int[] arr) {
        Arrays.sort(arr); // sort the array in non-decreasing order
        int i = 0;
        int j = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int[] closestPair = new int[2];

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                closestPair[0] = arr[i];
                closestPair[1] = arr[j];
            }
            if (sum < 0) {
                i++;
            } else {
                j--;
            }
        }

        return closestPair;
    }
}
