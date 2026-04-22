package lab01;

import java.util.Scanner;

public class EquationSolver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose the type of equation to solve:");
	        System.out.println("1. First-degree equation with one variable (ax + b = 0)");
	        System.out.println("2. System of first-degree equations with two variables");
	        System.out.println("3. Second-degree equation with one variable (ax^2 + bx + c = 0)");
	        System.out.print("Enter your choice (1, 2, or 3): ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                solveLinearEquation(scanner);
	                break;
	            case 2:
	                solveLinearSystem(scanner);
	                break;
	            case 3:
	                solveQuadraticEquation(scanner);
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }
	        System.exit(0);
	        scanner.close();
	    }

	    private static void solveLinearEquation(Scanner scanner) {
	        System.out.print("Enter coefficient a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Enter coefficient b: ");
	        double b = scanner.nextDouble();

	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Infinite solutions (any x is a solution).");
	            } else {
	                System.out.println("No solution (contradiction).");
	            }
	        } else {
	            double x = -b / a;
	            System.out.println("Solution: x = " + x);
	        }
	    }

	    private static void solveLinearSystem(Scanner scanner) {
	        System.out.println("Enter coefficients for the system of equations:");
	        System.out.print("a11: ");
	        double a11 = scanner.nextDouble();
	        System.out.print("a12: ");
	        double a12 = scanner.nextDouble();
	        System.out.print("b1: ");
	        double b1 = scanner.nextDouble();
	        System.out.print("a21: ");
	        double a21 = scanner.nextDouble();
	        System.out.print("a22: ");
	        double a22 = scanner.nextDouble();
	        System.out.print("b2: ");
	        double b2 = scanner.nextDouble();

	        double D = a11 * a22 - a21 * a12;
	        double D1 = b1 * a22 - b2 * a12;
	        double D2 = a11 * b2 - a21 * b1;

	        if (D == 0) {
	            if (D1 == 0 && D2 == 0) {
	                System.out.println("Infinitely many solutions.");
	            } else {
	                System.out.println("No solution.");
	            }
	        } else {
	            double x1 = D1 / D;
	            double x2 = D2 / D;
	            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
	        }
	    }

	    private static void solveQuadraticEquation(Scanner scanner) {
	        System.out.print("Enter coefficient a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Enter coefficient b: ");
	        double b = scanner.nextDouble();
	        System.out.print("Enter coefficient c: ");
	        double c = scanner.nextDouble();

	        if (a == 0) {
	            System.out.println("This is not a quadratic equation (a cannot be 0).");
	            return;
	        }

	        double discriminant = b * b - 4 * a * c;

	        if (discriminant > 0) {
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("Two distinct real roots: root1 = " + root1 + ", root2 = " + root2);
	        } else if (discriminant == 0) {
	            double root = -b / (2 * a);
	            System.out.println("One real double root: root = " + root);
	        } else {
	            System.out.println("No real roots (discriminant is negative).");
	        }
	    }
	
	}


