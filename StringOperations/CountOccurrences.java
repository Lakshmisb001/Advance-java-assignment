/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package ADV_JAVA;
import java.util.Scanner;
public class CountOccurrences {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Count how many times a substring appears in a main string");
	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();
	        
	        System.out.print("Enter the substring to search for: ");
	        String subString = scanner.nextLine();
	        
	        int occurrences = countOccurrences(mainString, subString);
	        
	        System.out.println("The substring \"" + subString + "\" appears " + 
	                          occurrences + " time(s) in the main string");
	        
	        scanner.close();
	    }
	   
	    public static int countOccurrences(String mainString, String subString) {
	        // Handle edge cases
	        if (mainString == null || subString == null || 
	            mainString.isEmpty() || subString.isEmpty()) {
	            return 0;
	        }
	        
	        int count = 0;
	        int index = 0;
	        
	        // Loop to find all occurrences
	        while ((index = mainString.indexOf(subString, index)) != -1) {
	            count++;
	            index += subString.length(); // Move index beyond the found substring
	        }
	        
	        return count;
	    }
	}