package Enums;

class PaymentStatus {
    static int SUCCESS=1;
    static int PENDING=2;
    static int FAILED=3;

}
public class ProblemWithClasses {
    public static void main(String[] args) {
        int status = PaymentStatus.SUCCESS;
        status = 200;
    }
}

/*
    Problems

    1. we expect 1,2,3 but 200 

    2. if(paymentStatus == 2)-> No same type of Groups

    class Roles {
        USER=1;
        ADMIN=2;

        if(paymentStatua == USER)-> No compiler error
        and Duplicate Values like Admin => 2 and PENDING=2
    }

*/