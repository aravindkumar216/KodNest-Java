
import java.util.Scanner;

public class demoScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int a = sc.nextInt();
        System.out.println("Age is: " + a);

        System.out.println("Enter the height: ");
        float b = sc.nextFloat();
        System.out.println("Height is: " + b);

        sc.nextLine(); //This nextLine will help to store the space value between the name

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Name is: " + name);
        sc.close();
    }
}
