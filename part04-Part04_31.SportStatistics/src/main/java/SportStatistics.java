
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Integer> teamRecords = readRecordsFromFile(file, team);
        
        System.out.println("Games: " + teamRecords.get(0));
        System.out.println("Wins: " + teamRecords.get(1));
        System.out.println("Losses: " + teamRecords.get(2));        
    }
    
    public static ArrayList<Integer> readRecordsFromFile(String file, String team) {
        int gameCount = 0;
        int wins = 0;
        int losses = 0;
        
        ArrayList<Integer> records = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if (line.contains(team)) {
                    String[] parts = line.split(",");
                    
                    String team1 = parts[0];
                    String team2 = parts[1];                    
                    int team1Points = Integer.valueOf(parts[2]);
                    int team2Points = Integer.valueOf(parts[3]);

                    gameCount++;
                    
                    if (team.equals(team1)) {
                        if (team1Points > team2Points) {
                            wins++;
                        } else {
                            losses++;
                        }
                    } else if (team.equals(team2)) {
                        if (team2Points > team1Points) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }
                }             
            }           
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        records.add(gameCount);
        records.add(wins);
        records.add(losses);
        
        return records;
    }
}
