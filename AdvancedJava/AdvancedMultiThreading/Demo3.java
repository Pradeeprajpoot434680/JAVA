/*
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED

NEW

Thread t1 = new Thread();

System.out.println(t1.getState());
**************************************************
RUNNABLE
Thread t1 = new Thread();

t1.start();

System.out.println(t1.getState());
************************************************************
Java's RUNNABLE state includes both:

    Ready to execute.
    Currently executing.



    What is wait() in Java?

    wait() is a method of the Object class.
    It makes the current thread release the object's monitor lock and enter the waiting state.
    The thread waits until another thread calls notify() or notifyAll() on the same object (or until a timeout expires, if specified).
    It must be called from within a synchronized context.

    2. What is BLOCKED state?

    A thread enters the BLOCKED state when it tries to acquire a lock (monitor) that is already held by another thread.
*/
public class Demo3 {
    /*
            NEW
              |
           start()
              |
              v
          RUNNABLE
              |
       ----------------
       |       |      |
       v       v      v
    BLOCKED  WAITING  TIMED_WAITING
       |       |      |
       ----------------
              |
       Condition satisfied
              |
              v
          RUNNABLE
              |
        run() completes
              |
              v
         TERMINATED

    
    
    
    */
}
