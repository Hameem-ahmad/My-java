
import java.util.*;

public class reverse_num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();

        System.out.print("how many numbers do you want to reverse: ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = sc.nextInt();
            numList.add(number);
        }

        Collections.reverse(numList);
        System.out.println("Reversed numbers: " + numList);

    }
}
