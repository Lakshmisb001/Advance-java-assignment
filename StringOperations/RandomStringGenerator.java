/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package ADV_JAVA;
import java.util.Random;
public class RandomStringGenerator {
	    // Function to generate a random string of given length
	    public static String generateRandomString(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            // Pick a random character and append
	            int index = random.nextInt(characters.length());
	            sb.append(characters.charAt(index));
	        }

	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        int length = 10;
	        System.out.println("Random String: " + generateRandomString(length));
	    }
	}

