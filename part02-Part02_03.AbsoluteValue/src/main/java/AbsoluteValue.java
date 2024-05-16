
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int absolute = 0;
        if (num < 0) {
            absolute = num * -1;
            System.out.println(absolute);
        } else {
            System.out.println(num);
        }
    }
}
