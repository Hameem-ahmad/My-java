
import java.util.Scanner;

public class AhmedBila {

    private double balence = 506.50;
    private double remb = 0;
    private int pin = 2244;
    private double withdraw;
    private int attempt = 0;
    private Scanner sc = new Scanner(System.in);
    private int transfer;

    public void withdrawCash() {
        System.out.print("Askri Bank ATM\n Enter your pin of ATM: ");
        int user1 = 11223344;
        //pin=sc.nextInt();
        while (attempt <= 3) {
            if (pin == sc.nextInt()) {
                System.out.println("Pin code is correct\n Welcome to the Askri Bank ");
                System.out.println("remaining: " + remb);
                System.out.println("Your balence " + balence + "$ ");
                System.out.print("what do you want withdraw / exit / transfer  :");

                withdraw = sc.nextInt();
                if (withdraw < balence) {

                    remb = balence - withdraw;

                    System.out.println("Your remaning balence is " + remb + " $");
                    transfer = sc.nextInt();
                } else if (transfer < balence) {
                    System.out.println("how much money transfering   ");

                }

            } else {
                System.out.print("Incorrect pin code \n write correct pin ");

            }
            attempt++;
        }

    }

}
