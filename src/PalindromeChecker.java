import java.util.Scanner;

public class PalindromeChecker {

    // This is the magical function that helps us spot if the phrase is a secret mirror image of itself!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your best word or phrase, I’ll check if it’s a palindrome!");
        String input = sc.nextLine();

        // Let's make this phrase as silly as possible (by transforming it!)
        String sillyTransformed = turnIntoSillyString(input);

        // Time to check if it’s a palindrome! It’s like a fun house mirror, but with words.
        boolean isPalindrome = isItALaughingPalindrome(sillyTransformed);
        if (isPalindrome) {
            System.out.println("Whoooa, this is a palindrome! 🤯");
        } else {
            System.out.println("Nope, this is not a palindrome! 😞");
        }
    }

    // Transform the input into a lowercase, punctuation-free giggle-fest!
    public static String turnIntoSillyString(String input) {
        input = input.toLowerCase(); // Make everything lowercase for extra chill vibes
        input = input.replace(",", ""); // Bye-bye commas, you're too fancy for this party
        input = input.replace("!", ""); // No exclamations here, let's keep it cool
        return input;
    }

    // Let’s check if our silly transformed phrase is a palindrome, like a fun mirror image!
    public static boolean isItALaughingPalindrome(String input) {
        String reversed = reverseItAndLaugh(input);
        return input.equals(reversed); // If it’s the same, we have a palindromic high-five!
    }

    // Reversing the string – turning it around like a dance move!
    public static String reverseItAndLaugh(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i)); // Adding each character, but backwards!
        }
        return reversed.toString(); // Ta-da, it's reversed!
    }
}