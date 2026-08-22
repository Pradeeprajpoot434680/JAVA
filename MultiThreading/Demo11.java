/*
    DEMO11 - Java Synchronization Concepts (3 Cases)

    This file demonstrates different types of locking mechanisms in Java
    multithreading using synchronized methods and synchronized blocks.

    --------------------------------------------------------------------
    CASE 1: Object Lock vs No Lock (Test class)
    --------------------------------------------------------------------
    - syncMethod() is synchronized → uses object-level lock (this)
    - normalMethod() is NOT synchronized → no lock required

    Behavior:
    - syncMethod() blocks other synchronized methods on same object
    - normalMethod() can run freely at any time
    - syncMethod() and normalMethod() can execute concurrently

    Key Idea:
    Only synchronized methods compete for the same object lock.

    --------------------------------------------------------------------
    CASE 2: Static Shared Lock Object (Test2 class)
    --------------------------------------------------------------------
    - A single static lock object is shared across all instances
    - method1(), method2(), and printDemo() all use the SAME lock

    Behavior:
    - Only one thread can execute ANY of these methods at a time
    - Even if methods are in different instances, lock is shared
    - Ensures global synchronization across class

    Key Idea:
    static lock = class-wide synchronization across all objects.

    --------------------------------------------------------------------
    CASE 3: Independent + Mixed Locks (Test3 class)
    --------------------------------------------------------------------
    - lock1 → used by method1()
    - lock2 → used by method2()
    - lock3 → static lock used by printDemo()

    Behavior:
    - method1() and method2() run independently (different locks)
    - printDemo() is globally synchronized using static lock
    - method1() and method2() can run in parallel
    - printDemo() blocks other threads using lock3

    Key Idea:
    Different locks allow parallel execution, improving concurrency.

    --------------------------------------------------------------------
    SUMMARY:
    --------------------------------------------------------------------
    1. synchronized method → uses "this" lock
    2. static lock → shared across all objects (class level)
    3. custom locks → allow fine-grained control
    4. different locks → allow parallel execution
    5. same lock → forces sequential execution
*/


class Test {

    synchronized void syncMethod() {
        System.out.println(Thread.currentThread().getName() + " entered syncMethod");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        System.out.println(Thread.currentThread().getName() + " leaving syncMethod");
    }

    void normalMethod() {
        System.out.println(Thread.currentThread().getName() + " entered normalMethod");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        System.out.println(Thread.currentThread().getName() + " leaving normalMethod");
    }
}


class Test2 {

    private static final Object lock = new Object();

    void method1() {

        synchronized (lock) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " entered method1");

            try {
                Thread.sleep(3000);
            } catch (Exception e) {}

            System.out.println(
                    Thread.currentThread().getName()
                            + " leaving method1");
        }
    }

    void method2() {

        synchronized (lock) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " entered method2");

            try {
                Thread.sleep(3000);
            } catch (Exception e) {}

            System.out.println(
                    Thread.currentThread().getName()
                            + " leaving method2");
        }
    }


    static void printDemo(){
        synchronized (lock) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " entered PrintDemo");

            try {
                Thread.sleep(3000);
            } catch (Exception e) {}

            System.out.println(
                    Thread.currentThread().getName()
                            + " leaving PrintDemo");
        }

    }
}




class Test3 {

    private  final Object lock1 = new Object();
    private final Object lock2 = new Object();
    private static final Object lock3 = new Object();

    void method1() {

        synchronized (lock1) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " entered method1");

            try {
                Thread.sleep(3000);
            } catch (Exception e) {}

            System.out.println(
                    Thread.currentThread().getName()
                            + " leaving method1");
        }
    }

    void method2() {

        synchronized (lock2) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " entered method2");

            try {
                Thread.sleep(3000);
            } catch (Exception e) {}

            System.out.println(
                    Thread.currentThread().getName()
                            + " leaving method2");
        }
    }


    static void printDemo(){
        synchronized (lock3) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " entered PrintDemo");

            try {
                Thread.sleep(3000);
            } catch (Exception e) {}

            System.out.println(
                    Thread.currentThread().getName()
                            + " leaving PrintDemo");
        }

    }
}



public class Demo11 {
    public static void main(String[] args) {

        // Test obj = new Test();

        // Thread t1 = new Thread(() -> obj.syncMethod(), "T1");
        // Thread t2 = new Thread(() -> obj.normalMethod(), "T2");

        // t1.start();
        // t2.start();


        // Test2 test2 = new Test2();

        // Thread t1 = new Thread(() -> test2.method1(), "T1");
        // Thread t2 = new Thread(() -> test2.method2(), "T2");
        // Thread t3 = new Thread(()-> Test2.printDemo());
        // t1.start();    
        // t2.start();
        // t3.start();



        Test3 test3 = new Test3();

        Thread t1 = new Thread(() -> test3.method1(), "T1");
        Thread t2 = new Thread(() -> test3.method2(), "T2");
        Thread t3 = new Thread(()-> Test2.printDemo());

        t1.start();    
        t2.start();
        t3.start();



    }
}

