import java.util.*;

class Series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        double s = 0;
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        sc.close();

        for (i = 1; i <= n; i++)
            s = s + 1.0 / Math.pow(2, i);
        System.out.println("The sum is " + s);
    }
}