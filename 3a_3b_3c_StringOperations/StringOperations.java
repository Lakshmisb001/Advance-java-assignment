package ADV_JAVA;

public class StringOperations {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = new String("Java Programming");

	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);
	        System.out.println("String 3: " + str3);

	        // 2. Length and Character Access
	        System.out.println("\nLength of str3: " + str3.length());
	        System.out.println("Character at index 5 in str3: " + str3.charAt(5));

	        // 3. String Comparison
	        String a = "OpenAI";
	        String b = "openai";
	        System.out.println("\nEquals: " + a.equals(b)); // case-sensitive
	        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));

	        // 4. String Searching
	        String sentence = "Welcome to Java Programming";
	        System.out.println("\nIndex of 'Java': " + sentence.indexOf("Java"));
	        System.out.println("Last index of 'm': " + sentence.lastIndexOf('m'));

	        // 5. Substring Operations
	        System.out.println("\nSubstring from index 11: " + sentence.substring(11));
	        System.out.println("Substring from index 11 to 15: " + sentence.substring(11, 15));

	        // 6. String Modification
	        String modified = sentence.replace("Java", "Python");
	        System.out.println("\nReplaced 'Java' with 'Python': " + modified);
	        System.out.println("Uppercase: " + sentence.toUpperCase());
	        System.out.println("Lowercase: " + sentence.toLowerCase());

	        // 7. Whitespace Handling
	        String spaced = "   Hello Java!   ";
	        System.out.println("\nOriginal with spaces: '" + spaced + "'");
	        System.out.println("Trimmed: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String full = str1.concat(" ").concat(str2);
	        System.out.println("\nConcatenated String: " + full);
	        // Or using + operator
	        String plusConcat = str1 + " " + str2;
	        System.out.println("Using + operator: " + plusConcat);

	        // 9. String Splitting
	        String csv = "apple,banana,grape,orange";
	        String[] fruits = csv.split(",");
	        System.out.println("\nSplitted fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // 10. StringBuilder Demo (for mutable strings)
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, ",");
	        sb.replace(0, 5, "Hi");
	        sb.delete(3, 4);
	        System.out.println("\nStringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 25;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("\nFormatted String: " + formatted);

	        // 12. Validate Email using contains(), startsWith(), endsWith()
	        String email = "user@example.com";
	        boolean isValid = email.contains("@") &&
	                          email.contains(".") &&
	                          email.startsWith("user") &&
	                          email.endsWith(".com");

	        System.out.println("\nEmail Validation:");
	        System.out.println("Email: " + email);
	        System.out.println("Is valid? " + isValid);
	    }
	}

