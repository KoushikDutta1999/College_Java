class bank {
    void getRateofInterest() {
        System.out.println("Rate of Interest: 2.0%");
    }
}

class PNB extends bank {
    void getRateofInterest() {
        System.out.println("Rate of Interest for PNB: 5.0%");
    }
}

class SBI extends bank {
    void getRateofInterest() {
        System.out.println("Rate of Interest for SBI: 10.0%");
    }
}

class ICICI extends bank {
    void getRateofInterest() {
        System.out.println("Rate of Interest for ICICI: 15.0%");
    }
}

class rateofInterest {
    public static void main(String args[]) {
        bank p = new bank();
        bank q = new PNB();
        bank r = new SBI();
        bank s = new ICICI();

        System.out.println("Rate of interest Details of Base bank: ");
        p.getRateofInterest();
        System.out.println("Rate of interest Details of PNB bank: ");
        q.getRateofInterest();
        System.out.println("Rate of interest Details of SBI bank: ");
        r.getRateofInterest();
        System.out.println("Rate of interest Details of ICICI bank: ");
        s.getRateofInterest();
    }
}