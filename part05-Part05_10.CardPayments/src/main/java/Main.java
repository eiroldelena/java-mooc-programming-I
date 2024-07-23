
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        
//        PaymentCard eirol = new PaymentCard(10);
//        
//        System.out.println(eirol.balance());
//        boolean wasSuccessful = eirol.takeMoney(6);
//        
//        
//        System.out.println("Successfully withdrew: " + wasSuccessful);
//        System.out.println(eirol.balance());
        
//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//
//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatAffordably(5);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatHeartily(4.3);
//        System.out.println("remaining change " + change);
//
//        System.out.println(unicafeExactum);
//        
//        
//        PaymentCard card = new PaymentCard(2.50);
//        
//        System.out.println(card.balance());
//        
//        boolean wasSuccessful = unicafeExactum.eatHeartily(card);
//        System.out.println("There was enough money? " + wasSuccessful);
//        
//        wasSuccessful = unicafeExactum.eatAffordably(card);
//        System.out.println("There was enough money? " + wasSuccessful);
//        
//        System.out.println(card.balance());
//        unicafeExactum.addMoneyToCard(card, 100);
//        System.out.println(card.balance());        

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}

