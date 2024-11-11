import java.util.Scanner;

// This is palindrome checker!!!
public class PalindromeChecker {

    // This is the magical function that helps us spot if the phrase is a secret mirror image of itself!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        String transformed = transformInput(input);

        // Time to check if it’s a palindrome! It’s like a fun house mirror, but with words.
        boolean isPalindrome = isPalindrome(transformed);
        if (isPalindrome) {
            System.out.println("Whoooa, this is a palindrome! 🤯");
        } else {
            System.out.println("Nope, this is not a palindrome! 😞");
        }
    }

    // Transform the input into a lowercase, punctuation-free giggle-fest!
    public static String transformInput(String input) {
        return input.toLowerCase().replaceAll("[,!]", "");
    }

    // Let’s check if our silly transformed phrase is a palindrome, like a fun mirror image!
    public static boolean isPalindrome(String input) {
        return input.equals(reverseString(input));
    }

    // Reversing the string – turning it around like a dance move!
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}