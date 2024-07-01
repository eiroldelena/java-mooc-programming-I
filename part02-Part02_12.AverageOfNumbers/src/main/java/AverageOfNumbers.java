
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countInput = 0;
        double sum = 0;
        double average = 0;
        
        while (true) {
            System.out.println("Give a number:");
            double input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            sum = sum + input;
            countInput++;
        }
        
        
        average = sum / countInput;
        System.out.println("Average of the numbers: " + average);
    }
}
