
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int n : array) {
            printStars(n);
        }
    }
        
    public static void printStars(int num) {
        int i = 1;
        while (i <= num) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

}
