import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        float a = sc.nextFloat();
        System.out.print("Enter the 2nd number : ");
        float b = sc.nextFloat();
        System.out.print("Enter the 3rd number : ");
        float c = sc.nextFloat();
        sc.close();

        if (a > b && a > c) {
            System.out.println("Biggest number is : " + a);
        } else if (b > c && b > a) {
            System.out.println("Biggest number is : " + b);
        } else {
            System.out.println("Biggest number is : " + c);
        }
    }
}