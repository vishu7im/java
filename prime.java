import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your index");
        int a = sc.nextInt();
        char result = 'f';

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {

                result = 't';
                break;
            }

        }

        if (result == 't') {
            System.out.println(a + " is not the prime no! ");

        } else {
            System.out.println(a + " is the prime no ! ");

        }

    }

}
