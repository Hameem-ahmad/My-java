
import java.util.Random;
import java.util.Scanner;

public class Random_num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int attempts = 0;
        int guess;
        int randnum = rand.nextInt(11);

        //  System.out.println("Random number " + randnum);
        System.out.println("Number guessing game !");
        System.out.println("Guess a number between 1 and 10 ");

        do {
            System.out.print("Enter the guess  ");
            guess = sc.nextInt();
            if (guess < randnum) {
                System.out.println("YOur guess is smaller ");
            } else if (guess > randnum) {
                System.out.println("Your guess is greater ");
            } else {
                System.out.println("Correct you won the game ");
            }

            attempts++;
        } while (guess != randnum);
        sc.close();
    }
}
