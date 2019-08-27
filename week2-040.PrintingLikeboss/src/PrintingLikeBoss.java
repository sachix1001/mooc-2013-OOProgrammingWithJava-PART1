public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount > 0){
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(0 < amount){
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int star = 1;
        while( 0 < size){
            
            printWhitespaces(size-1);
            printStars(star);
            star++;
            size--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int star = 1;
        int leaves = height;
        while(0 < leaves){
            printWhitespaces(leaves-1);
            printStars(star);
            leaves--;
            star += 2;
        }
        int i = 0;
        while(i < 2){
        printWhitespaces(height-2);
        printStars(3);
        i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
