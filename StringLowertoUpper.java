//import java.lang.*;

class StringLowertoUpper {
    public static void main(String args[])

    {
        String MyName = "Koushik Dutta";
        System.out.println(MyName);
        String low = MyName.toLowerCase();
        String up = MyName.toUpperCase();
        System.out.println(low);
        System.out.println(up);
        String first = "Koushik ";
        String last = "Dutta";
        System.out.println(first + last);
        String name = "Mr. ".concat(first + last);
        System.out.println(name);
    }

}