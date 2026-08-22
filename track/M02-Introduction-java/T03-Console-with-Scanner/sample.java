
import java.util.Scanner;

public class sample {

//public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the days: ");
        int days = scanner.nextInt();

        int total = 0;
        System.out.println("enter problem solvede days: ");
        for (int day = 1; day <= days; day++) {
            int solved = scanner.nextInt();

            total += solved;
        }
        String status;

        if (total >= 20) {
            status = "Strong progress";
        } else if (total >= 10) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }

        System.out.println("Total solved: " + total);
        System.out.println("Status: " + status);
    }
}
