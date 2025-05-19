/*Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package ADV_JAVA;

public class CountWords {

	    // Function to count the number of words in a string
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0; // Handle empty or null strings
	        }

	        String[] words = str.trim().split("\\s+"); // Split by spaces
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String input = "This is a sample sentence for counting words.";
	        System.out.println("Input: " + input);
	        System.out.println("Number of words: " + countWords(input));
	    }
	}

