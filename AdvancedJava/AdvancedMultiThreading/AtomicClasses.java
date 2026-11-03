/*
    7. volatile Keyword and Atomic Classes

    What is Visibility?
    Diff diff threads diff diff values

    7.2 What is volatile?

    The volatile keyword guarantees visibility of writes to a volatile
     variable across threads, along with important ordering guarantees


     7.3 Atomic Classes
     AtomicInteger.
    AtomicLong.
    AtomicBoolean.
    AtomicReference.


    Method	Purpose
    get()	Returns current value
    set()	Updates value
    incrementAndGet()	Increments and returns new value
    getAndIncrement()	Returns old value, then increments
    decrementAndGet()	Decrements and returns new value
    addAndGet()	Adds value and returns new result
    compareAndSet()	Updates only if the current value matches the expected value
    getAndSet()	Updates value and returns old value



    What is CAS?

    CAS stands for Compare-And-Set (commonly also called Compare-And-Swap).

    It is an important concept behind many atomic operations.
    


*/

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count = new AtomicInteger();

    void increament(){
        count.incrementAndGet();
    }
}
public class AtomicClasses {
    
}
