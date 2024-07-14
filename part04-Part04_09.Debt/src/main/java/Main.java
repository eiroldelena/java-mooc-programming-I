
public class Main {

    public static void main(String[] args) {
        // Test your Debt class here
        //Debt mortgage = new Debt(120000.0, 1.01);
        //mortgage.printBalance();

        //mortgage.waitOneYear();
        //mortgage.printBalance();

        //int years = 0;

        //while (years < 20) {
        //    mortgage.waitOneYear();
        //    years = years + 1;
        //}

        //mortgage.printBalance();
        
        Debt credit = new Debt(5000.0, 1.5);
        
        credit.printBalance();
        credit.waitOneYear();
        credit.printBalance();
        
    }
}
