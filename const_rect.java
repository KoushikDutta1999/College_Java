import java.util.Scanner;

class Rectangle_1 {
    double length, width;

    Rectangle_1() {
        length = width = 0;
    }

    Rectangle_1(double l, double w) {
        length = l;
        width = w;
    }

    Rectangle_1(Rectangle_1 R) {
        length = R.length;
        width = R.width;
    }

    void Rec_area() {
        double area = length * width;
        System.out.println("The area of rectangel is: " + area);
    }
}

public class const_rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the Width of rectangle: ");
        int w = sc.nextInt();

        Rectangle_1 obj = new Rectangle_1();
        System.out.println("The area of rectangel using default Constructor is: ");
        obj.Rec_area();

        Rectangle_1 obj1 = new Rectangle_1(l, w);
        System.out.println("The area of rectangel using parameterized Constructor is: ");
        obj1.Rec_area();

        Rectangle_1 obj2 = new Rectangle_1(obj1);
        System.out.println("The area of rectangel using copy Constructor is: ");
        obj2.Rec_area();

        sc.close();
    }
}