import java.util.Scanner;

public class MatrixSearcher {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int[][] matrix = {{1, 4, 7, 11, 15},
                          {2, 5, 8, 12, 19},
                          {3, 6, 9, 16, 22},
                          {10, 13, 14, 17, 24},
                          {18, 21, 23, 26, 30}};
        System.out.println("Enter target:");
        int target = sc.nextInt();
        boolean found = searchMatrix(matrix, target);
        System.out.println("The element " + target + " is " + (found ? "" : "not ") + "found in the matrix.");
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
