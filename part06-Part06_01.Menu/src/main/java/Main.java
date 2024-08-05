
public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();
        
        exactum.addMeal("Cheesy tonkatsu");
        exactum.addMeal("Adobo");
        exactum.addMeal("Wintermelon Milktea");
        
        exactum.printMeals();
        
        exactum.clearMenu();
        
        exactum.addMeal("Cheesy Tonkatsu");
        exactum.printMeals();
    }
}
