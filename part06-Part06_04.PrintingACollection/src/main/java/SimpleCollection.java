
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        String printOut = "";
        String row = "";
        
        if (elements.size() == 1) {
            printOut = "The collection " + this.name + " has " + elements.size() + " element:" + "\n";
            row = elements.get(0);                    
        }
        
        if (elements.size() > 1) {
            printOut = "The collection " + this.name + " has " + elements.size() + " elements:" + "\n";
            
            for (String i : elements) {
                row = row + i + "\n";
            } 
        }
        
        return printOut + row;
    }
}
