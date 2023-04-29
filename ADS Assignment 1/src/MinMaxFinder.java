public class MinMaxFinder {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 12}; // example array
        int[] result = findMinMax(arr); // find the min and max
        System.out.println("The minimum number is: " + result[0]);
        System.out.println("The maximum number is: " + result[1]);
    }

    public static int[] findMinMax(int[] arr) {
        int[] result = new int[2];
        if (arr == null || arr.length == 0) {
            return result;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }
}
