import java.util.*;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f;
        System.out.println("Enter a fahrenheit value: ");
        f = sc.nextInt();
        sc.close();

        double c = ((f - 32) * 5) / 9;
        System.out.println("Celsius = " + c);
    }

}
