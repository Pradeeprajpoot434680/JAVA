public class Demo {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.pay();
    }
}

class Payment {
    void pay(){
        System.out.println("Payement");
    }
}

class CreditCard extends Payment {
    void pay(){
        System.out.println("Credit card Pay");
    }
}

/* problem 
    Using a normal (concrete) class instead of an abstract class is not
     always wrong. The problem appears when you want to force subclasses 
     to provide their own implementation.

     but we know every payment will have pay method
     
*/