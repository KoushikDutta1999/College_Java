import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = sc.nextInt();
        sc.close();
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println("GCD of 1st number and 2nd number is: " + n2);
    }
}