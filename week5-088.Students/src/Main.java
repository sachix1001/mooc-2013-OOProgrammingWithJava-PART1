
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Student> list = new ArrayList<Student>();

    public static void main(String[] args) {

        // write here the main program
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("sutudentnumber: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");

        for (Student s : list) {
            if (s.getName().contains(search)) {
                System.out.println(s);
            }

        }
    }
}
