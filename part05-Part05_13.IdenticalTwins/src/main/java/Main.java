
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program

        SimpleDate date1 = new SimpleDate(17, 2, 2001);
        SimpleDate date2 = new SimpleDate(9, 5, 1997);
        SimpleDate date3 = new SimpleDate(17, 2, 2001);
        
        Person person1 = new Person("Johnny", date1, 63, 14);
        Person person2 = new Person("Depp", date2, 90, 23);
        Person person3 = new Person("Amber", date3, 27, 34);
        
        boolean areTwins = person1.getBirthday().equals(person2.getBirthday());
        System.out.println("Are Johnny and Depp twins? " + areTwins);
        
        areTwins = person1.getBirthday().equals(person3.getBirthday());
        System.out.println("Are Johnny and Amber twins? " + areTwins);        
    }
}
