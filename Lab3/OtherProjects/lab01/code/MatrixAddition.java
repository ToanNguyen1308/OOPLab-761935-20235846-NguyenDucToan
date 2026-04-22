import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter the matrices manually? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        int[][] matrix1;
        int[][] matrix2;
        int rows, cols;

        if (choice.equals("yes")) {
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            cols = scanner.nextInt();

            matrix1 = new int[rows][cols];
            matrix2 = new int[rows][cols];

            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            // Display the manually entered matrices
            System.out.println("First matrix (entered manually):");
            printMatrix(matrix1);

            System.out.println("Second matrix (entered manually):");
            printMatrix(matrix2);
        } else {
            // Use constant matrices if the user chooses not to enter manually
            matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            matrix2 = new int[][]{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
            rows = matrix1.length;
            cols = matrix1[0].length;

            // Display the constant matrices
            System.out.println("First matrix (constant):");
            printMatrix(matrix1);

            System.out.println("Second matrix (constant):");
            printMatrix(matrix2);
        }

        // Adding two matrices
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of the matrices:");
        printMatrix(sumMatrix);

        scanner.close();
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}