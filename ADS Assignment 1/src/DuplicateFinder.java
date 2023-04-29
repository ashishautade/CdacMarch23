public class DuplicateFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 9}; // example array
        int duplicate = findDuplicate(arr); // find the duplicate number
        System.out.println("The duplicate number is: " + duplicate);
    }

    public static int findDuplicate(int[] arr) {
        int duplicate = -1;
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1; // calculate the index of the current element
            if (arr[index] < 0) { // check if the element at the calculated index is negative
                duplicate = Math.abs(arr[i]);
                break;
            } else {
                arr[index] = -arr[index]; // negate the element at the calculated index
            }
        }
        return duplicate;
    }
}
