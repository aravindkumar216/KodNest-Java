
//-------------- Sample if-else-program to switch------------------
/*int day = 6;

if (day >= 1 && day <= 5) {
System.out.printin("Learning Day");
} else if (day == 6 || day == 7) {
System.out.printin("Revision Day");
} else {
System.out.printin("Invalid Day");
}
 */
//---------------------converting if-else-if to switch------------------
import java.util.Scanner;

public class ifesletoswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day;
        day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Learning Day");
                break;
            case 6:
            case 7:
                System.out.println("Revision Day");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
