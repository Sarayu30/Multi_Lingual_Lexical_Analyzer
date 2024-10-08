import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        int reversed = 0, original = num, remainder;
        
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        
        return original == reversed;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isPalindrome(num))
            System.out.println(num + " is a palindrome.");
        else
            System.out.println(num + " is not a palindrome.");
    }
}
