
import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int days = scanner.nextInt();
        switch (days) {
            case 1 ->
                System.out.println("Monday");
            case 2 ->
                System.out.println("Tuesday");
            case 3 ->
                System.out.println("Wednesday");
            case 4 ->
                System.out.println("Thursday");
            case 5 ->
                System.out.println("Friday");
            default ->
                System.out.println("Error Invalid Day");
        }
        scanner.close();
    }
}
