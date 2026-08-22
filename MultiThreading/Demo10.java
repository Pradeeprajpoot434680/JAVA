/*
    Demonstrates the difference between Class-Level Locks and Object-Level Locks.

    - Static synchronized methods (increment() and fun1()) acquire
      the lock on Counter.class (Class-Level Lock).

    - Synchronized instance methods (objectMethod()) acquire
      the lock on the current object instance (this).

    Key Observation:
    ----------------
    1. increment() and fun1() cannot execute simultaneously because
       both compete for the same lock: Counter.class.

    2. objectMethod() uses a different lock (c1 object), so it can
       execute concurrently with increment() or fun1().

    Therefore, Class-Level Locks and Object-Level Locks are independent
    of each other.

    Lock Mapping:
    -------------
    increment()   --> Counter.class
    fun1()        --> Counter.class
    objectMethod()--> c1 (or the object on which it is called)
*/

class Counter {
    
    static int count = 0;

    static synchronized void increment(String threadName) {
        System.out.println(threadName + " entered");

        count++;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + " leaving");
    }

    static synchronized void fun1(String threadName){
         System.out.println(threadName + " entered In class Method");
         try {
            Thread.sleep(2000);
         } catch (Exception e) {
            
         }

          System.out.println(threadName + " leaving From the class Method");
    }

    synchronized void objectMethod(String threadName){
         System.out.println(threadName + " entered In Object Method");
         try {
            Thread.sleep(2000);
         } catch (Exception e) {
            // TODO: handle exception
         }

          System.out.println(threadName + " leaving From the Object Method");
    }
}


public class Demo10 {
      public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Thread t1 = new Thread(() -> c1.increment("T1"));
        Thread t2 = new Thread(() -> c2.increment("T2"));
        Thread t3 = new Thread(()-> c1.fun1("T3"));
         Thread t4 = new Thread(()-> c1.objectMethod("T4"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}