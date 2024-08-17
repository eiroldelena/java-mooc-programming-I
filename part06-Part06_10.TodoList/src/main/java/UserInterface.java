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
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            processCommands(command);
        }
    }
    
    public void processCommands(String command) {
        switch (command) {
            case "add":
                add();
                break;
            case "remove":
                remove();
                break;
            case "list":
                list();
                break;
            default:
                System.out.println("Unknown command");
        }        
    }
    
    public void add() {
        System.out.println("To add:");
        String task = scanner.nextLine();
                
        this.list.add(task);
    }
    
    public void remove() {
        System.out.println("Which one to remove? ");
        int removeNum = Integer.valueOf(scanner.nextLine());
        
        this.list.remove(removeNum);
    }
    
    public void list() {
        this.list.print();
    }
}
