
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("Eirol", "Are you sure that you need to check this?");
        
        MessagingService globe = new MessagingService();
        globe.add(message);
        System.out.println(globe.getMessages());
    }
}
