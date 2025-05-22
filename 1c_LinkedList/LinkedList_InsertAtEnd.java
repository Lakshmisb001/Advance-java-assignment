/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package ADV_JAVA;
import java.util.*;
public class LinkedList_InsertAtEnd {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding some elements
	        list.add("Red");
	        list.add("Green");

	        // Inserting element at the end using offerLast
	        list.offerLast("Pink");

	        System.out.println("LinkedList after inserting at end: " + list);
	    }
	}
