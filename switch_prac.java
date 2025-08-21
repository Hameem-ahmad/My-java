
import java.util.*;

public class switch_prac {

    public static void main(String[] args) {
        String day = "Monday";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your day!");
        day = sc.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.print("it is weekday");
                break;
            default:
                System.out.print("it is not the weekday");

        }
        sc.close();
    }
}
