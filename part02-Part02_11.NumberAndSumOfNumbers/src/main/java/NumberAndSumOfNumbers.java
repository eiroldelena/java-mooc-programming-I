
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countInput = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            sum = sum + input;
            countInput++;
        }
        
        System.out.println("Number of numbers: " + countInput);
        System.out.println("Sum of the numbers: " + sum);
    }
}
