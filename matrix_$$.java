
import java.util.Scanner;

public class matrix_$$ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        char symbol;

        System.out.print("Enter the row size ");
        row = sc.nextInt();

        System.out.print("Enter the colun size ");
        col = sc.nextInt();

        System.out.println("Enter the Symbol");
        symbol = sc.next().charAt(0);

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                System.out.print(symbol);
            }
            System.out.println("");
        }
    }

}
