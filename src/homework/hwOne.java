package homework;

public class hwOne {
    /**
     * Homework 1:
     * Store the values for below scenario in a appropriate variable, and printthe same in Console.
     * 1. number of hours in a day
     * 2. max no. of days in a year
     * 3. total number employees in a organization
     * 4. Population in a country
     * 5. Mortgage rate
     * 6. Balance in a bank account
     * 7. does the sun rise from the west?
     * 8. Initials of your name (Use: char)
     */

    public static void main(String[] args) {

        // 1. Number of hours in a day

        byte dayHours = 24;
        System.out.println("Day Has " + dayHours + " Hours");

        // 2. Max no. of days in a year

        short daysInAyear = 365;
        System.out.println("\nMaximum number of days in a regular year are " + daysInAyear);

        // 3. Total number of employees in a organization
        // Example: Organization is Target with number of employees 409,000

        int numOfEmployees = 409000;
        System.out.println("\nAccording to year 2020 TARGET has " + numOfEmployees + " employees");

        // 4. Population in a country
        // Exmp: Population of USA in 2020 (329.5 million)

        double usPopulation = 329.5;
        System.out.println("\nPopulation of UNITED STATES in 2020 was " + usPopulation + " million");

        // 5. Mortgage rate

        float mortgageRate = 2.53f;
        System.out.println("\nMortage Rate = " + mortgageRate + "%");

        // 6. Balance in a bank account

        double accountBalane = 13528.33;
        System.out.println("\nAfter depositing the check my Balance in Bank Account is " + accountBalane + "$");

        // 7. Does the sun rise from the west?

        boolean sunRiseInWest = false;
        System.out.println("\nDoes the sun rise from the west? = " + sunRiseInWest);

        // 8. Initials of your name (Use: char)

        char firstName = 'E';
        char lastName = 'N';

        System.out.println("\nMy initials for my name (Ermal Nikci) are "+ firstName+lastName);


    }
}

