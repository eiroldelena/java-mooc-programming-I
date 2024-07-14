
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account myAccount = new Account("Eirol's account", 100.0);
        
        System.out.println("Initial state:");
        System.out.println(myAccount);
        
        System.out.println("Night shift allowance: 5000");
        myAccount.deposit(20.0);
        System.out.println();
        
        System.out.println("Money left: ");
        System.out.println(myAccount);
    }
}
