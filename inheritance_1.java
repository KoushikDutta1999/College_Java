//import java.util.*;

class Room {
    double length;
    double breadth;

    Room(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

}

class GuestRoom extends Room {
    double height;

    GuestRoom(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }

}

public class inheritance_1 {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);

        GuestRoom myRoom = new GuestRoom(5, 7, 10);
        double area = myRoom.area();
        double volume = myRoom.volume();
        System.out.println("Area = " + area);
        System.out.println("Volume = " + volume);
    }
}