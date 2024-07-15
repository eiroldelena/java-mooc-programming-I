
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            } 
        
            int convert = Integer.valueOf(input);
            int cube = convert * convert * convert;
            
            System.out.println(cube);
            
        }
    }
}
