
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Person ai = new Person("Ai", 60);
        Person me = new Person("Me", 32);
        
        Room room2 = new Room();
        System.out.println("Is room2 empty? " + room2.isEmpty());
        
        room2.add(ai);
        room2.add(me);
        
        for (Person person : room2.getPersons()) {
            System.out.println(person);
        }
        
        System.out.println("Shortest: " + room2.shortest());
        System.out.println("Shortest: " + room2.take());
        
        for (Person person : room2.getPersons()) {
            System.out.println(person);
        }
    }
}
