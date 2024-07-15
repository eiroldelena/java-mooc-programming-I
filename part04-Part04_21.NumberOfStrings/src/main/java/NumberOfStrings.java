
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            } 
            
            words.add(input);
        }
        
        System.out.println(words.size());
        
    }
}
