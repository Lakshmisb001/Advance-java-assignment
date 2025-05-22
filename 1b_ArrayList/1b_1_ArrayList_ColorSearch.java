/*1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
package ADV_JAVA;
import java.util.*;
public class ArrayList_ColorSearch {
	 public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Colors: " + colors);

	        if (colors.contains("Red")) {
	            System.out.println("Color 'Red' is available.");
	        } else {
	            System.out.println("Color 'Red' is not available.");
	        }
	    }
	}
