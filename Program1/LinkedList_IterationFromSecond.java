/*1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package ADV_JAVA;
import java.util.*;
public class LinkedList_IterationFromSecond {
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding some elements to the list
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        // Creating an iterator starting from index 1 (second element)
	        Iterator<String> iterator = list.listIterator(1);

	        System.out.println("Iterating from 2nd position:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}

