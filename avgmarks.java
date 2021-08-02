import java.util.Scanner;

public class avgmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st marks : ");
        float n1 = sc.nextFloat();
        System.out.print("Enter the 2nd marks : ");
        float n2 = sc.nextFloat();
        System.out.print("Enter the 3rd marks : ");
        float n3 = sc.nextFloat();
        sc.close();

        float total = n1 + n2 + n3;
        double avg = total / 3.0;
        {
            System.out.println("Average of these three marks is " + avg);
        }
    }
}