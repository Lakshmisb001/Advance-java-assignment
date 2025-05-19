/*Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
package ADV_JAVA;

public class IsNumeric {

	    // Function to check if string contains only numbers
	    public static boolean isNumeric(String str) {
	        return str.matches("\\d+"); // Matches only digits
	    }

	    public static void main(String[] args) {
	        String input1 = "123456";
	        String input2 = "123abc";

	        System.out.println(input1 + " is numeric? " + isNumeric(input1));
	        System.out.println(input2 + " is numeric? " + isNumeric(input2));
	    }
	}
