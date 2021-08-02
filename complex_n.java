//import java.util.*;

class complex {
    int real, imag;

    complex() {
        real = imag = 0;
    }

    complex(int r, int i) {
        real = r;
        imag = i;
    }

    void calc(complex c) {
        System.out.printf("\nAddition of two complex numbers: %d + %di and %d + %di is: ", real, imag, c.real, c.imag);
        System.out.printf("%d + %di", (real + c.real), (imag + c.imag));
        System.out.printf("\nDifference of two complex numbers: %d + %di and %d + %di is: ", real, imag, c.real,
                c.imag);
        System.out.printf("%d + %di", (real + c.real), (imag + c.imag));
        int mr = ((real * c.real) - (imag * c.imag));
        int mi = ((real * c.real) + (imag * c.imag));
        System.out.printf("\nMultiplication of two complex numbers: %d + %di and %d + %di is: ", real, imag, c.real,
                c.imag);
        System.out.printf("%d + %di", mr, mi);
    }
}

class complex_n {
    public static void main(String args[]) {
        complex c1 = new complex(4, 3);
        complex c2 = new complex(7, 6);
        c1.calc(c2);
    }
}