/*
    Problem in reader writer lock
    if there is huge number of readers -> too many reader locks
    so this adds some overhead so -> read with lock first -> if not possible then lock

*/


/*
    
    StampedLock
    Write Lock – Exclusive access for writing.
    Read Lock – Multiple threads can read simultaneously.
    Optimistic Read – Reads without acquiring a lock initially, then validates whether a write occurred.

*/

import java.util.concurrent.locks.StampedLock;

class StampedLockDemo {
    int value = 0;

    StampedLock lock = new StampedLock();

   void write(){
        long stamp= lock.writeLock();
    
        try {
            value++;
        }
        finally {
            lock.unlockWrite(stamp);
        }
   }


   void read(){

    // long stamp= lock.readLock();
    long stamp = lock.tryOptimisticRead();
    
    try {
        value++;
    }
    finally {
        lock.unlockRead(stamp);
    }
    }
}

public class Demo5 {
    
}
