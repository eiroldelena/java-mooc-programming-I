
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        list.add("Get money");
        list.add("Do laundry");
        list.add("Get backpack");
        list.add("Get coffee");
        list.print();
        
        System.out.println("");
        list.remove(1);
        list.print();
        
        System.out.println("");
        
        System.out.println("Testing interface...");
        UserInterface ui = new UserInterface(list, scanner);
        ui.start();

    }
}
