
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        
        int result = 0;
        
        int i = 0;
        while(i <= power){
            result += (int)Math.pow(2, i);
            i++;
        }
        System.out.print("The result is "+ result);
                

    }
}
