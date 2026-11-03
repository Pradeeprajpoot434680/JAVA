/*
    Let's understand the problem first.

    Suppose you have a database connection pool containing only 5 connections.

    Your application has 100 threads, and all 100 threads want database access.

    You don't want all 100 threads accessing the database simultaneously because:

        The database has limited connection capacity.
        Too many concurrent operations can overload the database.
        You want to control the maximum number of concurrent operations.

    A Semaphore solves this problem.

    Semaphore semaphore = new Semaphore(5);

    This means:

    At most 5 permits can be acquired simultaneously from the initial permits.



    Semaphore semaphore = new Semaphore(5);

int drained = semaphore.drainPermits();

System.out.println(drained);

System.out.println(semaphore.availablePermits());


*/

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {

    public static void main(String[] args) throws InterruptedException {
        // Semaphore semaphore = new Semaphore(5);

        // semaphore.acquire(2);
        // System.out.println(semaphore.availablePermits());
        // // semaphore.release(2);
        // semaphore.acquireUninterruptibly(5);
        // System.out.println(semaphore.availablePermits());

        //         4. acquireUninterruptibly(int permits)

        // Acquires multiple permits without interruptible waiting.


        // Semaphore semaphore = new Semaphore(1);

        // System.out.println(semaphore.tryAcquire());

        // System.out.println(semaphore.tryAcquire());


        //9. tryAcquire(long timeout, TimeUnit unit)

        // Semaphore semaphore = new Semaphore(1);

        // boolean acquired = semaphore.tryAcquire(
        //         5,
        //         TimeUnit.SECONDS
        // );

        // System.out.println(acquired);

        //
        // 10. tryAcquire(int permits, long timeout, TimeUnit unit)
        // 11. availablePermits()
        // 12. drainPermits()

        Semaphore semaphore = new Semaphore(5);

        int drained = semaphore.drainPermits();

        System.out.println(drained);

        System.out.println(semaphore.availablePermits());

    }
    
}
