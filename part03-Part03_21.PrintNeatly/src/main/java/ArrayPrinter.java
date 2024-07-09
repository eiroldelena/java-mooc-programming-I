
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int i = 0;
        
        while (true) {
            //break loop if it reaches the end but print the last number
            if (i >= array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            
            //print the number and add comma+space
            System.out.format("%d, ", array[i]);
            i++;
        }
    }
}
