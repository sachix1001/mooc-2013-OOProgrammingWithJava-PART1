
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Integer> scores = new ArrayList<Integer>();


    public static void main(String[] args) {
        Score scores = new Score();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type exam scores, -1 copmletes:");
        while(true){
            int score = Integer.parseInt(scanner.nextLine());
            if(score == -1){
                break;
            }
            scores.addScores(score);
        }
        scores.printScores();
        scores.printPercentage();
            
        
        
    }
    
    
}
// implement your program here
// do not put all to one method/class but rather design a proper structure to your program

// Your program should use only one Scanner object, i.e., it is allowed to call 
// new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

