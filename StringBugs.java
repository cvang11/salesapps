import java.util.Scanner;

/**
 * This program implements two buggy methods that process strings.
 *
 * @author Jim Skrentny, copyright 2009-2011, all rights reserved
 */

public class StringBugs{

    /**
     * Main program to test methods. 
     * 
     * @bugs none.
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String str = stdin.next();
        
        System.out.println("Enter a char: ");
        char ch = stdin.next().charAt(0);
        
        System.out.println("Character " + ch + " occurs "
                           + countOccurrences(str, ch) + " times in string \"" 
                           + str + "\".");
        
        System.out.println("\n\nEnter another String: ");
        str = stdin.next();
        
        System.out.println("The reverse of string \"" 
                            + str + "\" is " + reverseString(str));
    }   

    /**
     * Counts the number of occurrences of char ch in String str.
     * 
     * @param s - String to search for ch 
     * @param c - char whose occurrence should be counted 
     * @return int - the number of occurrences
     * 
     * @bugs There are TWO minor errors. Can you find and fix them?
     */
    public static int countOccurrences(String s, char c) {
        int count = 0;  // Start with count as 0
        if (s != null) {
            for (int i = 0; i < s.length(); i++) {  // Start the loop from 0
                if (s.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Reverses the String.
     * 
     * @param s - String to reverse 
     * @return String - the reversed String
     * 
     * @bugs There are TWO minor errors. Can you find and fix them?
     */
    public static String reverseString(String s) {
        // Convert string to a char array
        char[] swap = s.toCharArray();

        // Fix the loop to correctly reverse the string
        for (int i = 0; i < swap.length / 2; i++) {  // Only loop through half of the array
            char cTmp = swap[i];
            swap[i] = swap[swap.length - i - 1];  // Correct index for swapping
            swap[swap.length - i - 1] = cTmp;
        }

        // Convert the swapped array back to a String
        return new String(swap);
    }
}
