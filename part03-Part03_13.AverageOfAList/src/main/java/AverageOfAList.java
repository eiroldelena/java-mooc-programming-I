
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int sum = 0;
        int count = 0;
        double average = 0;
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            numbers.add(input);
        }
        
        System.out.println("");
               
        for (int n : numbers) {
            sum = sum + n;
            count++;
        }
        
        average = getAverage(sum, count);
        System.out.println("Average: " + average);
    }
    
    public static double getAverage (int sum, int count) {
        return sum / (double) count;
    }
}
