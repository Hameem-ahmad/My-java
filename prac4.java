
import java.util.*;

public class prac4 {
// error code 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int attempts = 0;
        int guess;

        sc.close();
        System.out.println("i am taking the random num");
        int add = rand.nextInt();

        do {
            System.out.println("Guess the random number ");
            if (guess == add) {
                System.out.println("Your guess is correct ");
            } else {
                System.out.println("Your guess is wrong");
            }
        } while (guess);
    }
}
