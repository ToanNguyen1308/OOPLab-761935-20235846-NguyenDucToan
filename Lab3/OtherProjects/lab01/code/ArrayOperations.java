import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter the array manually? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        int[] myArray;

        if (choice.equals("yes")) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            myArray = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                myArray[i] = scanner.nextInt();
            }
        } else {
            // Use a constant array if the user chooses not to enter manually
            myArray = new int[]{1789, 2035, 1899, 1456, 2013};
        }

        // Sort the array
        Arrays.sort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));

        // Calculate the sum of array elements
        int sum = 0;
        for (int value : myArray) {
            sum += value;
        }
        System.out.println("Sum of array elements: " + sum);

        // Calculate the average of array elements
        double average = (double) sum / myArray.length;
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}