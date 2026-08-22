/*
    Problems in Multithreding
    1.Race condition
    2.Atomicity
    3. Visibility Problem
    4. Ordering Problem

*/

class Counter {
    int count=0;

    void increment(){
        count++;
    }
}



// public class Demo6 {
//     public static void main(String[] args) throws Exception {
//         Counter c = new Counter();
//         Thread t1 = new Thread(()->{
//             for(int i=0; i<10000; i++){
//                 // System.out.println(Thread.currentThread().getName() + " - Count++");
//                 c.count++;
//             }
//         });

//         Thread t2 = new Thread(()->{
//             for(int i=0; i<10000; i++){
//                 // System.out.println(Thread.currentThread().getName() + " - Count++");
//                 c.count++;
//             }
//         });


//         t1.start();
//         t2.start();


//         t1.join();
//         t2.join();

//         System.out.println("Final Value of Count:"+c.count);
//     }
// }



class SharedData {
    volatile boolean flag=false;
}

public class Demo6 {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        Thread writer = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

            data.flag = true;
            System.out.println("Writer: flag set to true");
        });

        Thread reader = new Thread(()->{
           while (!data.flag) {
                // waiting for flag to become true
                //System.out.println("Reading flag...");this is already synchronized
            }
            System.out.println("Reader: detected flag change");
        });

        reader.start();
        writer.start();



    }
}