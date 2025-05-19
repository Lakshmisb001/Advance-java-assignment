/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package ADV_JAVA;

public class TruncateString {

	    // Function to truncate a string and add ellipsis
	    public static String truncate(String str, int length) {
	        if (str.length() <= length) {
	            return str;
	        } else {
	            return str.substring(0, length) + "...";
	        }
	    }

	    public static void main(String[] args) {
	        String input = "This is a long sentence that needs to be shortened.";
	        int length = 20;
	        System.out.println("Original: " + input);
	        System.out.println("Truncated: " + truncate(input, length));
	    }
	}
