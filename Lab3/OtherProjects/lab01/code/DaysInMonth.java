import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] monthNames = {"January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December"};
        String[] monthAbbreviations = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", 
                                       "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String[] monthThreeLetters = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                                      "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] daysInMonthCommon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInMonthLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String monthInput;
        int year;
        int monthNumber = -1;

        while (true) {
            System.out.print("Enter the month (full name, abbreviation, 3 letters, or number): ");
            monthInput = scanner.nextLine().trim();

            for (int i = 0; i < 12; i++) {
                if (monthInput.equalsIgnoreCase(monthNames[i]) || 
                    monthInput.equalsIgnoreCase(monthAbbreviations[i]) || 
                    monthInput.equalsIgnoreCase(monthThreeLetters[i]) || 
                    monthInput.equals(String.valueOf(i + 1))) {
                    monthNumber = i;
                    break;
                }
            }

            if (monthNumber != -1) {
                break;
            } else {
                System.out.println("Invalid month. Please try again.");
            }
        }

        while (true) {
            System.out.print("Enter the year (e.g., 1999): ");
            String yearInput = scanner.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);
                if (year >= 0) {
                    break;
                } else {
                    System.out.println("Year must be a non-negative number. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year format. Please enter a valid year.");
            }
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int daysInMonth = isLeapYear ? daysInMonthLeap[monthNumber] : daysInMonthCommon[monthNumber];

        System.out.println("Number of days in " + monthNames[monthNumber] + " " + year + " is: " + daysInMonth);

        scanner.close();
    }
}