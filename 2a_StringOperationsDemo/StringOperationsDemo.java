/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
package ADV_JAVA;
import java.util.*;
public class StringOperationsDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";

	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "Hello";
	        System.out.println("str1 equals str3: " + str1.equals(str3));  // true
	        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello")); // true

	        // 4. String Searching
	        String searchText = "Hello World";
	        System.out.println("Index of 'World' in searchText: " + searchText.indexOf("World")); // returns 6
	        System.out.println("searchText contains 'lo': " + searchText.contains("lo")); // true

	        // 5. Substring Operations
	        String substr = searchText.substring(6); // from index 6 to end
	        System.out.println("Substring from index 6: " + substr);

	        // 6. String Modification
	        String modified = searchText.replace("World", "Java");
	        System.out.println("Modified String: " + modified);

	        // 7. Whitespace Handling
	        String withSpaces = "   Welcome to Java   ";
	        System.out.println("Original with spaces: '" + withSpaces + "'");
	        System.out.println("After trim(): '" + withSpaces.trim() + "'");

	        // 8. String Concatenation
	        String concat = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated String: " + concat);

	        // 9. String Splitting
	        String names = "Alice,Bob,Charlie";
	        String[] nameArray = names.split(",");
	        System.out.println("Names after splitting:");
	        for (String name : nameArray) {
	            System.out.println(name);
	        }

	        // 10. StringBuilder Demo (for mutable strings)
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" Java");
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        int age = 25;
	        String formatted = String.format("My age is %d", age);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Validate Email with contains(), startsWith(), endsWith()
	        System.out.print("Enter your email: ");
	        String email = sc.nextLine();

	        boolean isValid = email.contains("@") &&
	                          email.endsWith(".com") &&
	                          (email.startsWith("user") || email.startsWith("admin"));

	        System.out.println("Is email valid (basic check)? " + isValid);

	        sc.close();
	    }
	}
