
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        int lower = 0;
        int upper = 5;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        list.add(5);
        list.add(1);
        
        System.out.format("The numbers in the range [%d, %d] \n", lower, upper);
        printNumbersInRange(list, lower, upper);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int n : numbers) {
            if (n >= lowerLimit && n <= upperLimit) {
                System.out.println(n);
            }
        }
    }
}
