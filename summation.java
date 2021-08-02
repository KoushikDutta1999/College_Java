import java.util.*;

class summation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int m = sc.nextInt();
        sc.close();

        int n, sum = 0;

        while (m > 0) {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.print("Summation of Digits : " + sum);
    }
}