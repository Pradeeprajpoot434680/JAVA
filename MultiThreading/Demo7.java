class Counter {
    int count=0;

    synchronized void increment(){
        count++;
    }
}


public class Demo7 {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();

        Thread t1 = new Thread(()->{

            for(int i=0; i<10000; i++){
                counter.increment();
                // System.out.println(Thread.currentThread().getName() + " Increment " + counter.count);

            }
        });

        Thread t2 = new Thread(()->{

             for(int i=0; i<10000; i++){
                counter.increment();
                // System.out.println(Thread.currentThread().getName() + " Increment " + counter.count);
            }

        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Value of count :" + counter.count);

    }    
}
