import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter line to check: ");
        String input = console.nextLine();
        if (isPalindrome(input.replaceAll("[^A-Za-z]+", ""))) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        console.close();
    }

    private static boolean isPalindrome (String s) {
        String r = new String();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            r += Character.toString(s.charAt(i));
        }

        if (s.equals(r)) {
            return true;
        }
        return false;
    }

}