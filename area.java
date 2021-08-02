import java.util.Scanner;

class shape {
    void area(int a, int b) {
        System.out.println("Basic area: " + a);
    }
}

class tri extends shape {
    void area(int a, int b) {
        System.out.println("Area of a triangle: " + (a * b) * 0.5);
    }
}

class rect extends shape {
    void area(int a, int b) {
        System.out.println("Area of rectange: " + a * b);
    }
}

class area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One side of the shape: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side of the shape: ");
        int b = sc.nextInt();
        shape p = new shape();
        shape q = new tri();
        shape s = new rect();

        p.area(a, b);
        q.area(a, b);
        s.area(a, b);
        sc.close();
    }
}