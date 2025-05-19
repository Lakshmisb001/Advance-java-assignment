package ADV_JAVA;
import java.util.Scanner;

public class CheckNullOrEmpty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Check if a string is null or empty");
        System.out.print("Enter a string (or just press Enter for empty string): ");
        String inputString = scanner.nextLine();
        
        if (isNullOrEmpty(inputString)) {
            System.out.println("The string is null or empty");
        } else {
            System.out.println("The string is not null or empty");
        }
        
        scanner.close();
    }
    
    public static boolean isNullOrEmpty(String str) {
        // Check if string is null
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }
}