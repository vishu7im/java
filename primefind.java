import java.util.*;

public class primefind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your index ");
        // this is for input
        int a = sc.nextInt();
        System.out.println("they are prime no between 1 to " + a + "\n");

        // i for counting till input
        for (int i = 1; i <= a; i++) {

            int count = 0; // this is show the number is prime or not
            for (int num = i; num >= 1; num--) {

                if (i % num == 0) {
                    count = count + 1;

                }

            }
            if (count == 2) {

                // code that append prime number
                System.out.print(i + " , ");

            }

        }

    }
}
