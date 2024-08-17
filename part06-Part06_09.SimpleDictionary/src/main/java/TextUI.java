/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            
            String input = this.scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                
                this.dictionary.add(word, translation);
                continue;
            }
            
            if (input.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = this.scanner.nextLine();
                
                String translated = this.dictionary.translate(toBeTranslated);

                System.out.println("Translation: ");
                
                System.out.println(translated);
                continue;
            }
            
            System.out.println("Uknown command");
        }
    }
}
