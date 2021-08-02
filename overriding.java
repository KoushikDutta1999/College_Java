//import java.util.*;

class Vehicals {
    public void move() {
        System.out.println("Vehicals can Move");
    }
}

class car extends Vehicals {
    public void move() {
        super.move();
        System.out.println("Car is travailing Vehicle");
    }
}

public class overriding {
    public static void main(String args[]) {
        Vehicals a = new Vehicals();
        Vehicals b = new car();
        a.move();
        b.move();
    }
}