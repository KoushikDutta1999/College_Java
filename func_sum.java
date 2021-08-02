import java.util.*;

public class func_sum {

    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        num1 = sc.nextInt();
        System.out.println("Second number : ");
        num2 = sc.nextInt();
        sum = addTwo(num1, num2);
        System.out.println("Sum of 2 numbers : " + sum);
        sc.close();
    }

    public static int addTwo(int a, int b) {
        int sum = a + b;
        return sum;
    }
}