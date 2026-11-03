/*
    StampedLock supports three modes:

    Write Lock.
    Read Lock.
    Optimistic Read.

    Read Lock – Multiple threads can read shared data simultaneously.
    Write Lock – Only one thread can modify shared data at a time.
    Optimistic Read Lock – Allows a thread to read data without acquiring an actual read lock.

    1. Read Lock

    Multiple threads can acquire the read lock simultaneously.
    No thread can acquire a write lock while readers hold the read lock.
    It is useful when multiple threads need to read shared data.



    2. Write Lock

    Only one thread can acquire the write lock.
    No other thread can read or write while the write lock is held.
    It provides exclusive access to shared data.

    3. Optimistic Read Lock (Most Important)

    This is the most interesting feature of StampedLock.

    Unlike a normal read lock, an optimistic read does not actually acquire a lock.

    It assumes that reading can happen safely without interference from a writer, then checks whether a write occurred during the read

    Method	Return type	Purpose
    readLock()	long	Acquires a read lock.
    writeLock()	long	Acquires an exclusive write lock.
    tryReadLock()	long	Acquires read lock only if immediately available.
    tryWriteLock()	long	Acquires write lock only if immediately available.
    tryOptimisticRead()	long	Returns an optimistic read stamp without acquiring a lock.
    validate(stamp)	boolean	Checks whether a write occurred since the optimistic stamp was obtained.
    unlockRead(stamp)	void	Releases the read lock.
    unlockWrite(stamp)	void	Releases the write lock.
    tryConvertToWriteLock(stamp)	long	Attempts to convert an existing stamp into a write lock.
    tryConvertToReadLock(stamp)	long	Attempts to convert an existing stamp into a read lock.
    tryConvertToOptimisticRead(stamp)	long	Attempts to convert an existing stamp into an optimistic read.
    isWriteLocked()	boolean	Checks whether the lock is currently write-locked.
    isReadLocked()	boolean	Checks whether the lock is currently read-locked.
    getReadLockCount()	int	Returns the current number of read locks.

*/

import java.util.concurrent.locks.StampedLock;

class SharedResource {
    private int count = 10;

    private final StampedLock lock = new StampedLock();

    // Write operation
    public void write(int value) {

        long stamp = lock.writeLock();

        try {
            count = value;
            System.out.println("Writing: " + count);

        } finally {
            lock.unlockWrite(stamp);
        }
    }

    void read(){
        long stamp = lock.tryOptimisticRead();

        int value = count;

        if(!lock.validate(stamp)){
            stamp = lock.readLock();
             try {
                value = count;

            } finally {
                lock.unlockRead(stamp);
            }
        }
         System.out.println("Reading: " + value);
    }

}
public class StampedLockDemo {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.read());

        Thread t2 = new Thread(() -> resource.read());

        Thread t3 = new Thread(() -> resource.write(100));

        t1.start();
        t2.start();
        t3.start();
    }
    
}
