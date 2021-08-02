//import java.util.*;

class first {
    int k;
}

class second extends first {
    int k;

    second(int a, int b) {
        super.k = a;
        k = b;
    }

    void display() {
        System.out.println("Super Class of K is : " + super.k);
        System.out.println("Sub Class of K is : " + k);
    }

}

class SuperTest {
    public static void main(String args[]) {
        second fareed = new second(1, 2);
        fareed.display();
    }

}