public class SecondLargestFinder {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 1, 9, 4}; // example array
        int secondLargest = findSecondLargest(arr); // find the second largest element
        System.out.println("The second largest element is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
