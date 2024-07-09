
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> list = new ArrayList<>();
        
        list.add("First");
        list.add("Seond");
        list.add("Third");
        list.add("Fourth");
        
        System.out.println(list);

        removeLast(list);
        
        System.out.println(list);
        
        removeLast(list);
        
        System.out.println(list);
        
    }
    
    public static void removeLast(ArrayList<String> list) {
        if (list.size() == 0) {
            return;
        }
        
        list.remove(list.size() - 1);
    }
}
