
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        
        int result =0;
                
        int i = 1;
        while(i <= number){
            result += i;
            i++;
        }
        System.out.println("Sum is "+ result);
    }
}
