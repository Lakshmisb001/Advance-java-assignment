/*Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package ADV_JAVA;
import java.util.Scanner;
public class RemoveWhitespace {    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Remove all whitespace from a string");
	        System.out.print("Enter a string with whitespace: ");
	        String inputString = scanner.nextLine();
	        
	        String result = removeWhitespace(inputString);
	        
	        System.out.println("Original string: \"" + inputString + "\"");
	        System.out.println("After removing whitespace: \"" + result + "\"");
	        
	        scanner.close();
	    }
	   
	    public static String removeWhitespace(String str) {
	        // Handle null case
	        if (str == null) {
	            return null;
	        }
	        
	        // Remove all whitespace characters (spaces, tabs, newlines, etc.)
	        return str.replaceAll("\\s", "");
	        
	       
	    }
	}