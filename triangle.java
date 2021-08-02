import java.util.*;

class Area {
    double side1, side2, side3;

    Area() {
        side1 = side2 = side3 = 0;
    }

    Area(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    Area(Area S) {
        side1 = S.side1;
        side2 = S.side2;
        side3 = S.side3;
    }

    void showarea() {
        double s = (side1 + side2 + side3) / 2;
        double area = (double) Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
        System.out.println("Area of the triangle: " + area);
    }

    void perimeter() {
        System.out.println("Perimeter of the triangle: " + (side1 + side2 + side3));
    }
}

public class triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1 of the triangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter side2 of the triangle: ");
        double b = sc.nextDouble();
        System.out.println("Enter side3 of the triangle: ");
        double c = sc.nextDouble();

        Area obj = new Area(a, b, c);
        obj.showarea();
        obj.perimeter();

        sc.close();
    }
}