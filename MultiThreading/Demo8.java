/*
    Here synchronized keyword takes the lock at object level
    when thread enters into a  m1 it takes object level lock
    now second thread wants to enter in the m2() . can not enter => object is locked

*/

class Test {
    synchronized void m1(){
        try {
            System.out.println("M1() enters");
            Thread.sleep(2000);
            System.out.println("M1() Exit...");
        } catch (Exception e) {

        }
    }   
    synchronized void m2(){
    try {
                System.out.println("M2() enters");
                Thread.sleep(2000);
                System.out.println("M2() Exit...");
            } catch (Exception e) {

            }
    }
}

public class Demo8 {
    public static void main(String[] args) {
        // Test test = new Test();


        // Thread t1 = new Thread(()->{
        //     test.m1();
        // });


        // Thread t2 = new Thread(()->{
        //     test.m2();
        // });

        // t1.start();
        // t2.start();


        Test test1 = new Test();
        Test test2 = new Test();

        
        Thread t1 = new Thread(()->{
            test1.m1();
        });


        Thread t2 = new Thread(()->{
            test2.m2();
        });

        t1.start();
        t2.start();

        /*
            separate objects has separate lock
        */

        
    }
}


