
import java.util.Scanner;

public class strt_nd_endnum {

    public static void main(String[] args) throws InterruptedException {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number ");
        num = sc.nextInt();
        int bomb;
        System.out.print("Enter the Ending number ");
        bomb = sc.nextInt();

        while (num < bomb) {
            num++;
            System.out.println(num);
            Thread.sleep(1000);
        }
        System.out.println("Between the numbers Which you can enter   : " + num + " " + bomb);
    }
}
