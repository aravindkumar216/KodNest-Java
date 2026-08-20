
import java.util.Scanner;

public class Condition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the marks (0 - 100): ");
        int num = scan.nextInt();
        /* >=90 grade A
        >=80 grade B
	       >=35 grade C
         */

        if (num >= 90) {
            System.out.println("GRADE A");
        } else if (num >= 80) {
            System.out.println("GRADE B");
        } else if (num >= 35) {
            System.out.println("GRADE C");
        } else {
            System.out.println("Study well bro!");
        }
        scan.close();
    }
}
