public class Demo2 {
    public static void main(String[] args) {
        
    }
}

abstract class Payment {
    abstract void pay();
}

class CreditCard extends Payment {
    void pay(){

    }
}

class UPI extends Payment {
    void pay(){

    }
}
/*

"I know WHAT you must do,
but I don't know HOW you do it"

*/

// Abstract Class = Two Things Together
//1. Common code
// /2. Contract enforcement