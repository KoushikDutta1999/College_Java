import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        age = sc.nextInt();
        sc.close();

        if (age >= 18)
            System.out.println("You are eligible for vote.");
        else
            System.out.println("You are not eligible for vote.");
    }
}