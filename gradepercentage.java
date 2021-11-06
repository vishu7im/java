import java.util.*;

public class gradepercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nfind the marks percentage\n\n~~~~~~~~~~~~~~");
        System.out.println("enter total marks out of ");
        int total = sc.nextInt();

        System.out.println("enter the marks in English ");
        int a = sc.nextInt();

        System.out.println("enter the marks in maths ");
        int b = sc.nextInt();

        System.out.println("enter the marks in hindi ");
        int c = sc.nextInt();

        System.out.println("enter the marks in Science ");
        int d = sc.nextInt();

        System.out.println("enter the marks in  SocialScience ");
        int e = sc.nextInt();

        System.out.println("enter the marks in languge ");
        int f = sc.nextInt();

        int marks = (a + b + c + d + e + f);
        float out = (total * 6);
        float percentage = (marks / out) * 100.0f;

        System.out.println("total marks is : " + marks);
        System.out.println("the percentage of marks is :" + percentage);

    }

}
