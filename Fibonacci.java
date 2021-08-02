import java.util.*;

class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your range : ");
        int n = sc.nextInt();

        sc.close();

        int x = 0, y = 1;
        System.out.print(x + " , " + y);

        for (int i = 1; i <= n; i++) {
            int z = x + y;
            System.out.print(" , " + z);
            x = y;
            y = z;
        }
    }
}