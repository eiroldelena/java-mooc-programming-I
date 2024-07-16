
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            while (fileReader.hasNextLine()) {
                int value = Integer.valueOf(fileReader.nextLine());
                
                if (value >= lowerBound && value <= upperBound) {
                    list.add(value);
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Numbers: " + list.size());
        
    }

}
