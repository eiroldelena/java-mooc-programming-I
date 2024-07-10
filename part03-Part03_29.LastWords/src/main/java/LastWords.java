
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            printLastWord(input);
        }
        
    }
    
    public static void printLastWord(String input) {
        //split input
        // go to the last word
        //print last word
        String[] pieces = input.split(" ");
        System.out.println(pieces[pieces.length - 1]);
    }
   
}
