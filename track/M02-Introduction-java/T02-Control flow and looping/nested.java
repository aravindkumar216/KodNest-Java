
public class nested {

    public static void main(String[] args) {

        boolean kfc = true;
        boolean wings = true;
        boolean overPriced = true;

        if (kfc) {
            System.out.println("entering into kfc");
            if (wings) {
                System.out.println("checking for wings");
                if (overPriced) {
                    System.out.println("but its costly so i will buy chicken");
                } else {
                    System.out.println("i will buy wings");
                }
            }
        } else {
            System.out.println("going to other shop");
        }
    }
