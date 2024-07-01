
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Give numbers:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            // Count Odd and Even input
            if (input % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            
            sum = sum + input;
            count++;
        }
        
        average = (double)sum / count;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
