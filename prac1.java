
import java.util.*;

class part {

    public int add(int x, int y) {
        if (x >= 10 && y >= 10) {
            return x + y;
        } else {
            return -1;
        }
    }

}

public class prac1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        part obj = new part();

        System.out.println("Enter the numbers which you want to add ");
        //  obj.add() = sc.nextInt(); 
        int add1 = obj.add(sc.nextInt(), sc.nextInt());
        System.out.println("After adding " + add1);

        int maybe = {1, 2, 3, 4, 5, 6};

    }
}
