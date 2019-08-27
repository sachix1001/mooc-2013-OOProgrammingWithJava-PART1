
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scanner = new Scanner(System.in);
        BirdList birdList = new BirdList();
        

        while (true) {
            System.out.print("?");
            String read = scanner.nextLine();
            if (read.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                birdList.addBird(new Bird(name, latinName));

            } else if (read.equals("Observation")) {
                System.out.println("What was observed:? ");
                String bird = scanner.nextLine();
                birdList.Obsevation(bird);

            } else if (read.equals("Statistics")) {
                birdList.statistics();

            } else if (read.equals("Show")) {
                System.out.println("What?");
                String bird = scanner.nextLine();
                birdList.show(bird);
            }else if(read.equals("Quit")){
                break;
            }
        }
    }
}
