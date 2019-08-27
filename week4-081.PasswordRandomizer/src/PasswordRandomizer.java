
import java.util.Random;

public class PasswordRandomizer {

    int passwardLength;
    String password;
    // Define the variables

    public PasswordRandomizer(int length) {
        this.passwardLength = length;
        // Initialize the variable
    }

    public String createPassword() {
        this.password = "";

        while (this.password.length() < passwardLength) {
            Random number = new Random();
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number.nextInt(25));
            this.password += symbol;
        }
        // write code that returns a randomized password
        return this.password;
    }
}
