/*
    ReaderWriter lock

*/

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedResource {

    int[] data = new int[20];
    int index = 0;

    ReadWriteLock lock = new ReentrantReadWriteLock();

    void readMultipleThreads() {
        lock.readLock().lock();
        try {
            if (index > 0) {
                System.out.println(Thread.currentThread().getName()
                        + " is reading " + data[index - 1]);
            } else {
                System.out.println(Thread.currentThread().getName()
                        + " Nothing to read.");
            }
        } finally {
            lock.readLock().unlock();
        }
    }

    void writeOneThread(int element) {
        lock.writeLock().lock();
        try {
            if (index < data.length) {
                data[index] = element;
                System.out.println(Thread.currentThread().getName()
                        + " is writing " + element);
                index++;
            } else {
                System.out.println("Array is full.");
            }
        } finally {
            lock.writeLock().unlock();
        }
    }
}


class Cache {

    private int value = 0;

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    void read() {
        lock.readLock().lock();

        try {
            System.out.println("Value = " + value);
        } finally {
            lock.readLock().unlock();
        }
    }

    void write(int x) {
        lock.writeLock().lock();

        try {
            value = x;
            System.out.println("Value updated to " + value);
        } finally {
            lock.writeLock().unlock();
        }
    }
}

class LockDowngradingExample {

    private static final ReentrantReadWriteLock lock =
            new ReentrantReadWriteLock();

    public  void lockDowngrding() {

        // Acquire write lock
        lock.writeLock().lock();
        try {
            System.out.println("Writing data...");

            // Downgrade: acquire read lock before releasing write lock
            lock.readLock().lock();
        } finally {
            lock.writeLock().unlock();
        }

        try {
            System.out.println("Reading updated data...");
        } finally {
            lock.readLock().unlock();
        }
    }
}


public class Demo4 {
    public static void main(String[] args) {

        // SharedResource resource = new SharedResource();

        // Thread writer = new Thread(() -> resource.writeOneThread(100), "Writer");

        // Thread reader1 = new Thread(() -> resource.readMultipleThreads(), "Reader-1");

        // Thread reader2 = new Thread(() -> resource.readMultipleThreads(), "Reader-2");

        // writer.start();
        // reader1.start();
        // reader2.start();


         Cache cache = new Cache();

        Thread writer = new Thread(() -> cache.write(100), "Writer");

        Thread reader1 = new Thread(() -> cache.read(), "Reader-1");

        Thread reader2 = new Thread(() -> cache.read(), "Reader-2");

        writer.start();
        reader1.start();
        reader2.start();

    }
}