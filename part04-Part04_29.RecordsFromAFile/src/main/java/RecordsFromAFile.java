
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        // read file and put each row in array
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            while (fileReader.hasNextLine()) {
                list.add(fileReader.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        

        for (String persons : list) {
            String[] person = persons.split(",");
            
            int age = Integer.valueOf(person[1]); 
            String year;
            
            if (age != 1 ) {
               year = "years";
            } else {
               year = "year";
            }
            
            System.out.println(person[0] + ", age: " + person[1] + " " + year);
        }        
    }
}
