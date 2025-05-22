/*Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package ADV_JAVA;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Reverse the characters in a string");
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        
        String reversedString = reverseString(inputString);
        
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
    
    public static String reverseString(String str) {
        // Handle null case
        if (str == null) {
            return null;
        }
        
        // Using StringBuilder for efficient string manipulation
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        
        return reversed.toString();
        
      
    }
}