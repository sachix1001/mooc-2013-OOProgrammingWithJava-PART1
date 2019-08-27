import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        while(this.numbers.size() < 7){
            Random random = new Random();
            int number = (random.nextInt(39))+1;
            if(!containsNumber(number)){
                numbers.add(number);
            }
        }
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
       
        return numbers.contains(number);
    }
}
