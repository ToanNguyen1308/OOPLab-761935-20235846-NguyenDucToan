package lab01;

import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		 // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // The user will enter the first number
        System.out.println("Enter the first number: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);

        // The user will enter the second number
        System.out.println("Enter the second number: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);

        // Calculate the sum
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Calculate the difference
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Calculate the product
        double product = num1 * num2;
        System.out.println("Product: " + product);

        // Calculate the quotient (check if the divisor is zero)
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Cannot divide by zero.");
        }
        
        // Close the scanner
        scanner.close();
        
        System.exit(0);
	}

}
