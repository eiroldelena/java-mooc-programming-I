
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter counter = new Counter(5);
        counter.decrease();
        counter.decrease(3);
        System.out.println(counter.value());
    }
}
