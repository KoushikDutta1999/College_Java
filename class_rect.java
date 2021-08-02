//import java.util.*;

class Rectangle {
    double length, width;

    void getData(double x, double y) {
        length = x;
        width = y;
    }

    double rectArea() {
        double area = length * width;
        return (area);
    }
}

class RectArea {
    public static void main(String args[]) {
        double area1, area2;
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.length = 15;
        rect1.width = 10;
        area1 = rect1.length * rect1.width;
        rect2.getData(20, 12);
        area2 = rect2.rectArea();
        System.out.println("Area 1 = " + area1);
        System.out.println("Area 2 = " + area2);
    }
}