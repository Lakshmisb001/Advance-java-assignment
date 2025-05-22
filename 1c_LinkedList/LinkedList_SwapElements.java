/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
package ADV_JAVA;
import java.util.*;
public class LinkedList_SwapElements {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding some elements
	        list.add("Red");    // index 0
	        list.add("Green");  // index 1
	        list.add("Blue");   // index 2

	        System.out.println("Original list: " + list);

	        // Swapping first (index 0) and third (index 2) elements
	        Collections.swap(list, 0, 2);

	        System.out.println("List after swapping 1st and 3rd elements: " + list);
	    }
	}

