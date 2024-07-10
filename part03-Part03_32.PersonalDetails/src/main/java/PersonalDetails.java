
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        int nameLen = 0;
        double average = 0.0;
        int sum = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(",");
            
            if (parts[0].length() > nameLen) {
                nameLen = parts[0].length();
                name = parts[0];
            } 
            
            sum = sum + Integer.valueOf(parts[1]);
            count++;            
        }

        average = sum / (double) count;
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);
    }
}
