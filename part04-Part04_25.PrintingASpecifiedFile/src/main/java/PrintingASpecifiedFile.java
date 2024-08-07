
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What file should have its contents printed?");
        
        String filename = scanner.nextLine();
        
        try (Scanner scanFile = new Scanner(Paths.get(filename))) {
            
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                System.out.println(row);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
