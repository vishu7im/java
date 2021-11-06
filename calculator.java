import java.util.*;

public class calculator {
    public static void main(String[] args) {
        // start:
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\nthis is the calculator \n ~~~~~~~~~~~~~~~~\n");
        System.out.println("enter your first digit ");
        float a = sc.nextFloat();
        System.out.println("enter your second digit ");
        float b = sc.nextFloat();

        System.out.println(
                "\n\nenter A for addition \n enter S for subtrction \n enter M for multiplication \n enter D for division ");

        String sw = sc.next();
        float result;

        switch (sw) {
        case "D":
            result = a / b;
            System.out.println("the division of digits is " + result);
            // goto start;
            break;
        case "M":
            result = a * b;
            System.out.println("the multiplication of digits is " + result);

            break;
        case "S":
            result = a - b;
            System.out.println("the diff of digits is " + result);

            break;
        case "A":
            result = a + b;
            System.out.println("the sum of digits is " + result);

            break;

        default:
            break;
        }

    }

}
