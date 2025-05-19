/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package ADV_JAVA;

public class CapitalizeWords {

	    // Function to capitalize the first letter of each word
	    public static String capitalizeWords(String str) {
	        String[] words = str.split(" ");
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            // Capitalize first character and add rest of the word
	            if (!word.isEmpty()) {
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1)).append(" ");
	            }
	        }

	        return capitalized.toString().trim(); // Trim to remove extra space
	    }

	    public static void main(String[] args) {
	        String input = "hello world java program";
	        System.out.println("Original: " + input);
	        System.out.println("Capitalized: " + capitalizeWords(input));
	    }
	}
