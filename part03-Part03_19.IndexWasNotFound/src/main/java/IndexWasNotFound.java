

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.println("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        int found = 0;
        
        // Implement the search functionality here   
        
        for (int i = 0; i <= array.length - 1; i++) {
            if  (searching == array[i]) {
                System.out.format("%d is at index %d. \n", searching, i);
                found++;
            }
        }
        
        if (found == 0) {
            System.out.format("%d was not found.", searching);
        }
    }
}
