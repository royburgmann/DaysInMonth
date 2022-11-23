import java.util.Scanner; // Import the Scanner class
import java.time.YearMonth; // Import the YearMonth class

class MonthCalculator {
    public static String userMonth = "";
    public static String[] months = {
            "january",
            "february",
            "march",
            "april",
            "may", "june",
            "july", "august",
            "september",
            "october",
            "november",
            "december"
    };

    public static void main(String[] args) {
        System.out.println("Find number of days in a month - Press 1 to exit.");
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        while (!userMonth.contains("1")) // loop while userMonth doesnt equal 1
        {
            System.out.print("Enter a month: "); // Request month from user
            userMonth = myObj.nextLine(); // Read user input and store in userMonth string

            if (userMonth.contains("1")) {
                System.out.println("Exiting Program. ");
                System.exit(0); // Exit program
            }
            for (int i = 0; i < months.length; i++) {
                /*
                 * convert userMonth characters to lowercase and check if string contains string
                 * in month[1].
                 * If so find days in month and store in daysInMonth. Print result in a
                 * formatted string.
                 */
                if (userMonth.toLowerCase().contains(months[i])) {
                    int temp = i;
                    YearMonth yearMonthObject = YearMonth.of(2022, ++temp);
                    int daysInMonth = yearMonthObject.lengthOfMonth();
                    System.out.println("Number of days in " + months[i].substring(0, 1).toUpperCase()
                            + months[i].substring(1) + ": " + daysInMonth);
                }
            }
        }
    }
}