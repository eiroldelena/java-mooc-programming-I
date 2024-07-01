
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositive = 0;
        double sum = 0;
        double average = 0;
        
        while (true) {
            System.out.println("Give a number:");
            double input = Integer.valueOf(scanner.nextLine());
            
            // breaks out of loop
            if (input == 0) {
                break;
            }
            
            // counts poisitve input and sum of them
            if (input > 0) {
                sum = sum + input;
                countPositive++;
            }
            
        }
        
        
        if (countPositive > 0) {
            average = sum / countPositive;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
