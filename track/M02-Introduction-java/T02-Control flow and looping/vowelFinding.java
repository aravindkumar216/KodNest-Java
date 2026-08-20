
import java.util.Scanner;

public class vowelFinding {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        char name = scan.next().charAt(0);

        switch (name) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
        scan.close();
    }
}
