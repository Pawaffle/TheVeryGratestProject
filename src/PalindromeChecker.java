import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to check if it's a palindrome:");
        String input = scanner.nextLine();

        String transformedInput = cleanInput(input);

        if (isPalindrome(transformedInput)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }

    // Removes punctuation and converts to lowercase for a standard comparison
    public static String cleanInput(String input) {
        return input.toLowerCase().replaceAll("[,!]", "");
    }

    // Checks if the input string is a palindrome by comparing it to its reverse
    public static boolean isPalindrome(String input) {
        return input.equals(reverseString(input));
    }

    // Reverses the input string
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}