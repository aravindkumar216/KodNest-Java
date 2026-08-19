
import java.util.Scanner;

public class Condition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll no");
        int rollno1 = scanner.nextInt();
        int rollno2 = scanner.nextInt();

        if (rollno1 > rollno2) {
            System.out.println("roll no 1 is greater");
        } else {
            System.out.println("roll no 2 greater");
        }
        scanner.close();
    }
}
