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
