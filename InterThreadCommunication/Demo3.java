/*
    Locks in Java
    1.ReentrantLock
    synchronized limitations:

        No timeout

        No fairness

        No interrupt support

        No multiple conditions

        ReentrantLock solves them.

        "Reentrant” means the same thread can acquire the same lock multiple times without deadlocking itself.
*/


/*
    lock()
    Thread waits forever
    Cannot be interrupted while waiting
     lockInterruptibly()
    Thread waits for lock
    BUT can be interrupted using thread.interrupt()
*/

import java.util.concurrent.locks.ReentrantLock;



class Counter {
    private int count = 0;

    private final ReentrantLock lock = new ReentrantLock();

    void increment() {
        lock.lock();  // acquire lock
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " -> " + count);
        } finally {
            lock.unlock(); // always release lock
        }
    }
}


class ReentrantLockDemo {
    private final ReentrantLock lock = new ReentrantLock();

    void outer(){
        lock.lock();

        try {
           System.out.println("Outer method");

            inner();
        } finally {
            lock.unlock();
        }
    }

    void inner(){
        lock.lock();

        try {
            System.out.println("Inner Method");
        }
        finally {
            lock.unlock();
        }
    }
}




class BankAccount {
    private int balance = 1000;

    private final ReentrantLock lock = new ReentrantLock();

    void withdraw(String name, int amount) {

        if (lock.tryLock()) {   
            try {
                System.out.println(name + " acquired lock");

                if (balance >= amount) {
                    System.out.println(name + " withdrawing " + amount);
                    balance -= amount;
                    System.out.println(name + " remaining balance: " + balance);
                } else {
                    System.out.println(name + " insufficient balance");
                }

                Thread.sleep(1000); // simulate processing time

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();  // always release
                System.out.println(name + " released lock");
            }

        } else {
            //  lock not available
            System.out.println(name + " could not acquire lock, will retry later");
        }
    }
}



class SharedResource {

    ReentrantLock lock = new ReentrantLock(true);
    
    void task() {
        try {
            System.out.println(Thread.currentThread().getName() + " trying to acquire lock");

            lock.lockInterruptibly();
             //  interruptible lock

            try {

                System.out.println(Thread.currentThread().getName() + " acquired lock");
                inner();
                System.out.println("Locked Inforamtion => " + lock.isLocked() + " by " + Thread.currentThread().getName() + " hold count->" + lock.getHoldCount());
                Thread.sleep(5000); // simulate long work

            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released lock");
            }

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted while waiting for lock");
        }
    }

    void inner(){
        lock.lock();

        System.out.println("Inner method");
        try {
            Thread.sleep(2000);
            System.out.println("Locked Inforamtion => " + lock.isLocked() + " by " + Thread.currentThread().getName() + " hold count->" + lock.getHoldCount() + " isFair Inforation =>" + lock.isFair());

        } catch (Exception e) {
            // TODO: handle exception
        }
        finally {
            lock.unlock();
        }
    }
}


public class Demo3 {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();

    //    Runnable task = () -> {
    //        for (int i = 0; i < 10000; i++) {
    //            counter.increment();
    //        }
    //    };

    //    Thread t1 = new Thread(task);
    //    Thread t2 = new Thread(task);

    //    t1.start();
    //    t2.start();



        // ReentrantLockDemo demo = new ReentrantLockDemo();
        // demo.outer();


        // BankAccount account = new BankAccount();

        // Runnable task = () -> {
        //     account.withdraw(Thread.currentThread().getName(), 700);
        // };

        // Thread t1 = new Thread(task, "Thread-1");
        // Thread t2 = new Thread(task, "Thread-2");

        // t1.start();
        // t2.start();



        SharedResource obj = new SharedResource();

        Thread t1 = new Thread(obj::task, "Thread-1");
        Thread t2 = new Thread(obj::task, "Thread-2");

        t1.start();
        t2.start();

        Thread.sleep(1000);

        t2.interrupt();


    }
}
