
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            oldest = getOldest(input, oldest);
        }

        System.out.println("Age of the oldest: " + oldest);
        
    }
    
    public static int getOldest(String input, int oldest) {
        // split the input with comma
        // get the oldest by comparing their first index (age)
        // return oldest
        
        String[] pieces = input.split(",");
        int age = Integer.valueOf(pieces[1]);
        
        if (age > oldest) {
            oldest = age;
        }
        
        return oldest;
    }
}
