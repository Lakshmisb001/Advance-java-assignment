/*Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/
package ADV_JAVA;
import java.util.Scanner;
public class CheckPalindrome {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Check if a string is a palindrome");
	        System.out.print("Enter a string to check: ");
	        String inputString = scanner.nextLine();
	        
	        if (isPalindrome(inputString)) {
	            System.out.println("\"" + inputString + "\" is a palindrome");
	        } else {
	            System.out.println("\"" + inputString + "\" is not a palindrome");
	        }
	        
	        scanner.close();
	    }
	   
	    public static boolean isPalindrome(String str) {
	        // Handle null case
	        if (str == null) {
	            return false;
	        }
	        
	        // Convert to lowercase and remove non-alphanumeric characters
	        String cleanStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
	        
	        // Empty string or single character is a palindrome
	        if (cleanStr.length() <= 1) {
	            return true;
	        }
	        
	        // Compare characters from both ends
	        int left = 0;
	        int right = cleanStr.length() - 1;
	        
	        while (left < right) {
	            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }
	}
