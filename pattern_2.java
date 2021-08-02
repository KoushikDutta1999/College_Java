import java.util.*;

class pattern_2 {
    public static void main(String[] args) {

        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println("The pattern is: ");
        for (int i = 1; i <= n; i += 2) {
            for (int j = n; j >= i; j -= 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}