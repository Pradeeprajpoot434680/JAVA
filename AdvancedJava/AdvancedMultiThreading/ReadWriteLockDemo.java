
/*
    3. Functions of ReadWriteLock

    1. readLock()

    Lock readLock();

    Purpose: Returns the lock used for reading shared data.

        Multiple threads can acquire the read lock simultaneously.
        A thread cannot acquire the read lock while another thread holds the write lock.
        It allows concurrent reading.


        2. writeLock()

        Lock writeLock();

        Purpose: Returns the lock used for writing shared data.

            Only one thread can hold the write lock.
            No other thread can hold the read lock while the write lock is held.
            It provides exclusive access to shared data.




            Method	       Purpose
            readLock()	Returns the read lock
            writeLock()	Returns the write lock
            getReadLockCount()	Returns the number of current readers
            isWriteLocked()	Checks whether the write lock is held
            isWriteLockedByCurrentThread()	Checks whether the current thread holds the write lock
            getReadHoldCount()	Returns the read-lock hold count of the current thread
            getWriteHoldCount()	Returns the write-lock hold count of the current thread
            getQueueLength()	Estimates the number of threads waiting for a lock
            hasQueuedThreads()	Checks whether any threads are waiting for the lock
        
*/

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedResource {
    private int count = 0;

    private  final ReadWriteLock rwLock = new ReentrantReadWriteLock();

    // read operation

    void read(){
        rwLock.readLock().lock();
        try  {
             System.out.println(
                Thread.currentThread().getName()
                + " Reading: " + count
            );
        } finally {
            rwLock.readLock().unlock();
        }
    }
    public void write(int value) {

        rwLock.writeLock().lock();

        try {
            System.out.println(
                Thread.currentThread().getName()
                + " Writing: " + value
            );

            count = value;

        } finally {
            rwLock.writeLock().unlock();
        }
    }
}
public class ReadWriteLockDemo {
    public static void main(String[] args) {
        
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.read(), "Thread-1");

        Thread t2 = new Thread(() -> resource.read(), "Thread-2");

        Thread t3 = new Thread(() -> resource.write(100), "Thread-3");

        Thread t4 = new Thread(() -> resource.read(), "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
