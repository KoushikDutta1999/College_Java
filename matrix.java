import java.util.*;

public class matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of matrix: ");
        int sum = 0;
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter the number: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum = sum + a[i][j];
            }
        }
        System.out.println("Sum: " + sum);

        sc.close();
    }
}
