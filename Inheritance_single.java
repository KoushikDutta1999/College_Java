class product {
    int product_no, quantity;
    String product_name;

    void getdata(int p_n, String name, int q) {
        product_no = p_n;
        product_name = name;
        quantity = q;
    }

    void show() {
        System.out.println("Number of products: " + product_no);
        System.out.println("Name of the products: " + product_name);
        System.out.println("Quantity of the product: " + quantity);
    }
}

class sale extends product {
    int rate, amount;

    void input(int r) {
        rate = r;
    }

    void calculate() {
        amount = quantity * rate;
    }

    void display() {
        System.out.println("Rate of the products: Rs." + rate);
        System.out.println("Total amount of the product: Rs." + amount);
    }
}

public class Inheritance_single {
    public static void main(String args[]) {
        sale obj = new sale();
        obj.getdata(7, "laptop", 2);
        obj.input(50000);
        obj.show();
        obj.calculate();
        obj.display();

    }
}
