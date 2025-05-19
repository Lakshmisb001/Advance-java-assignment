/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
package ADV_JAVA;
import java.util.*;
public class LinkedList_ElementsWithPositions {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding some elements
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");

	        // Displaying elements with their positions
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Element at position " + i + ": " + list.get(i));
	        }
	    }
	}

