
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }

            printWordsWithAV(input);
        }

    }
    
    public static void printWordsWithAV(String input) {           
        String[] pieces = input.split(" ");

        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i].contains("av")) {
                System.out.println(pieces[i]);
            }
        }
    }
}
