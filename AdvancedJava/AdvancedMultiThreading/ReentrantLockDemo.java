/*
    ReentrantLock is an explicit lock that allows the same thread to acquire the 
    same lock multiple times.

    Suppose Thread 1 acquires a lock.

    While holding that lock, it calls another method that tries to acquire the same lock.

    The thread can acquire it again without getting blocked.

*/
/*
    Features in ReentrantLock

    1. Explicit Locking and Unlocking
    ReentrantLock lock = new ReentrantLock();

    lock.lock();

    try {

        System.out.println("Critical section");

    } finally {

        lock.unlock();
    }



    2. trtLock();
    Unlike lock(), tryLock() doesn't wait indefinitely for the lock.
    if (lock.tryLock()) {

    try {

        System.out.println("Lock acquired");

    } finally {

        lock.unlock();
    }

    } else {

        System.out.println("Lock unavailable");
    }

    3.tryLock() with Timeout

    if (lock.tryLock(2, TimeUnit.SECONDS)) {

        try {

            System.out.println("Lock acquired");

        } finally {

            lock.unlock();
        }
    }

    4.Feature 4: Interruptible Locking

    lock.lockInterruptibly();

    A thread waiting to acquire this lock can be interrupted.

    This is different from the ordinary lock() method, which doesn't respond to interruption while waiting to acquire the lock.





    Feature 5: Fairness

    ReentrantLock lock = new ReentrantLock(true);

    The true argument enables fair locking.








*/

import java.util.concurrent.locks.ReentrantLock;

class Demo {
    ReentrantLock lock = new ReentrantLock();

    

    void method1(){
        lock.lock();

        try {
            System.out.println("Method 1");

            method2();

        }
        finally {
            lock.unlock();
        }
    }

    void method2() {

        lock.lock();

        try {

            System.out.println("Method 2");

        } finally {

            lock.unlock();
        }
    }
}

public class ReentrantLockDemo {
    
    public static void main(String[] args) {
        
    }
}
