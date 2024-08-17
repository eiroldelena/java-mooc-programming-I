
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        
        Item banana = new Item("Banana", 60);
        Item mango = new Item("Mango", 5);
        Item peach = new Item("Peach", 5);
        Item apple = new Item("Apple", 10);
        
        System.out.println(banana);
        
        Suitcase suitcase = new Suitcase(60);
        
        suitcase.addItem(mango);
        suitcase.addItem(banana);
        suitcase.addItem(peach);
        suitcase.addItem(apple);
        
        System.out.println(suitcase);
        
        suitcase.printItems();
        System.out.println("Heaviest: " + suitcase.heaviestItem());
        
        Hold hold = new Hold(75);
        hold.addSuitcase(suitcase);
        
        System.out.println(hold);
        hold.printItems();
    }

}
