
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack stack = new Stack();
        
        stack.isEmpty();
        stack.add("Hello");
        stack.add("Hello2");
        stack.isEmpty();
        System.out.println(stack.values());
        String s = stack.take();
        
        
        System.out.println("Taken: " + s);
        System.out.println("Values now");
        System.out.println(stack.values());
    }
}
