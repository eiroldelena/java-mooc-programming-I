
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int stars = 1;
        int spaces = size - 1;
        int topHeight = size;
        int base = 0;
        
        while (topHeight > 0 && stars <= size) {
            printSpaces(spaces);
            printStars(stars);

            topHeight--;
            spaces--;
            stars++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int topHeight = 0;
        int topWidth = 1; //acts like the middle/stem
        int sideSpaces = height - 1;
        
        int baseHeight = 2;
        int baseWidth = 3;
        int baseSpaces = height - 2;
        
        //top
        while (topHeight < height) {
            printSpaces(sideSpaces);
            printStars(topWidth);
            
            topWidth+=2; //stars increase by 2
            sideSpaces--;
            topHeight++;
        }
        
        //base
        while (baseHeight > 0) {
            printSpaces(baseSpaces);
            printStars(baseWidth);
            
            baseHeight--;
        }        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        System.out.println("---");
        christmasTree(7);
    }
}
