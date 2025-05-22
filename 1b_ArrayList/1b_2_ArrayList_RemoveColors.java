/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
package ADV_JAVA;
import java.util.ArrayList;
public class ArrayList_RemoveColors {
	

	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Original List: " + colors);

	        // Remove 2nd element (index 1)
	        if (colors.size() > 1) {
	            colors.remove(1);
	        }

	        // Remove "Blue"
	        colors.remove("Blue");

	        System.out.println("After removals: " + colors);
	    }
	}

