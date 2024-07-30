
public class Main {

    public static void main(String[] args) {
        // test your program here!
        
        SimpleDate date1 = new SimpleDate(30, 12, 2000);
        
        System.out.println(date1);
        date1.advance();
        System.out.println(date1);
        date1.advance(6);
        System.out.println(date1);
        
        
        System.out.println(date1);
        System.out.println(date1.afterNumberOfDays(30));
    }
}
