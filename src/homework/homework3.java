package homework;

import java.util.Locale;

public class homework3 {

    /**
     * String sentence1 = "Hello dear, how are you doing?"
     * int result1 = 0;
     * Store 100 in result1 if the length of sentence1 is greater than or equal to 10
     * else store 150 in result
     *
     * Use
     * ; Ternary operator (?:)
     * System.out.println("result1 = " + result1);
     *
     * String sentence2 = "Health was Earlier said to Be the ability of the body functioning Well."
     * Replace all instances of a/A with Z
     *
     * String sentence3 = "Health was Earlier said to Be the ability of the body functioning Well."
     * Print:
     * 1. the length of sentence3 - value
     * 2. result if the sentence3 starts with "health" (ignoring cases)
     * 3. result if the sentence3 contains "Body" (ignoring cases)
     * 4. index of "Body" in sentence3
     */

    public static void main(String[] args) {

        String sentence1 = "Hello dear, how are you doing?";
        int sentence1Length = sentence1.length();
        int result1 = sentence1Length>=10 ? 100 : 150;
        System.out.println("\nLength of '" + sentence1 + "' is = " + sentence1Length);
        System.out.println("\nresult1 = " + result1);


        String sentence2 = "Health was Earlier said to Be the ability of the body functioning Well.";
        String replaceThis = "A", replaceWith = "Z";
        String sentence2UpperCase = sentence2.toUpperCase();
        String sentence2Replace_A_to_Z =sentence2UpperCase.replace(replaceThis , replaceWith);
        System.out.println("\nThe Original : " + sentence2);
        System.out.println("\nAfter Replace : " + sentence2Replace_A_to_Z);


        String sentence3 = "Health was Earlier said to Be the ability of the body functioning Well.";
        int sentence3Length = sentence3.length();
        System.out.println("\nLenght of '" + sentence3 + "' is = " + sentence3Length);

        String checkFor = "Body";
        String sentence3_LowerCase = sentence3.toLowerCase();
        String checkFor_LowerCase = checkFor.toLowerCase();
        boolean isContains = sentence3_LowerCase.contains(checkFor_LowerCase);
        boolean isStartsWith_health = sentence3_LowerCase.startsWith("health");

        System.out.println("\n Is the '" + sentence3 + "' contains the '" + checkFor + "' (ignoring cases)? = "+ isContains);
        System.out.println("\nThe '"+ sentence3_LowerCase + "' starts with 'health' (ignoring cases) = " + isStartsWith_health);

        int IndexOfBody = sentence3.indexOf("Body");

        System.out.println("\nNumber of the Index 'Body' is = " + IndexOfBody);








    }



}
