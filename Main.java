/*
* Highest Run
*
* @author  Daniel
* @version 1.0
* @since   2022-10-11
*/

import java.util.Scanner;

/**
* Program calculates highest run in string
*/
final class Main {

    /**
    * Prevent instantiation.
    *
    * @throws IllegalStateException
    *
    */

	public static int maxRun(String str) {
		if (str == "") {
			return 0;
		}

		// Defining variables
        char tempChar = str.charAt(0);
        int counter = 1;
        int highestCount = 1;

        for (int index = 0; index < str.length(); index++) {
            if (tempChar == str.charAt(index)) {
                counter++;
            } else if (counter > highestCount) {
                highestCount = counter;
                counter = 1;
            } else {
                counter = 1;
            }
            tempChar = str.charAt(index);
        }
        return highestCount;
	}	

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Program calculates highest run in string
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // Input
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String userString = s.nextLine();

        // Calling function
        int max = maxRun(userString);

        // Output
        System.out.println("Biggest run: " + max);

        // Done
        System.out.println("\nDone.");
    }
}
