class time {
    int hrs, min, sec;

    time(int h, int m, int s) {
        hrs = h;
        min = m;
        sec = s;
    }

    public time(int h) {
        hrs = h;
        min = 0;
        sec = 0;
    }

    public time(int h, int m) {
        hrs = h;
        min = m;
        sec = 0;
    }

    public time() {
        hrs = 0;
        min = 0;
        sec = 0;
    }

    void time_test() {
        System.out.println(hrs + " hrs " + min + " min " + sec + " sec ");
    }
}

public class const_overloading {
    public static void main(String args[]) {
        time obj1 = new time();
        obj1.time_test();
        time obj2 = new time(10);
        obj2.time_test();
        time obj3 = new time(6, 50);
        obj3.time_test();
        time obj4 = new time(6, 6, 6);
        obj4.time_test();

    }
}
