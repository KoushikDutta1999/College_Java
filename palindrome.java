import java.util.*;

class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string number : ");
        int num = sc.nextInt();
        sc.close();

        int n = num, sum = 0;

        while (n > 0) {
            sum = (sum * 10) + (n % 10);
            n /= 10;
        }
        if (num == sum)
            System.out.println(num + " is a Palindrome.");
        else
            System.out.println(num + " is not a Palindrome.");
    }
}