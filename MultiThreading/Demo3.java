/*
    Important Methods in Multithreading
    sleep,join,yield, interrupt
*/

/*
public class Demo3 {
    public static void main(String[] args) {
        Thread t1  = new Thread(()->{
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Running...");
            } catch (Exception e) {
               
            }
        });

        Thread t2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });

        t1.start();
        t2.start();
    }
}
*/

// Join()


/*

public class Demo3 {
    public static void main(String[] args) {
        Thread t1  = new Thread(()->{
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Running...");
            } catch (Exception e) {
               
            }
        });

       

        t1.start();
        

        try {
            t1.join();
            // calling thread will wait 
        } catch (Exception e) {

        }

        System.out.println("Main Thread is Finished");
    }
}
*/


// yield()
/*
public class Demo3 {
    public static void main(String[] args) {
        Thread t1  = new Thread(()->{
            for(int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName() + " is printing :"+i);
                Thread.yield();
           }
        });

        Thread t2 = new Thread(()->{
           for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + " is printing :"+i);
           }
        });

       

        t1.start();
        t2.start();
        

        try {
            t1.join();
            // calling thread will wait 
        } catch (Exception e) {

        }

        System.out.println("Main Thread is Finished");
    }
}*/


// class Demo3 {
//     public static void main(String[] args) {
//           Thread t1 = new Thread(() -> {

//             try {
//                 System.out.println("Sleeping...");
//                 Thread.sleep(10000);
//                 System.out.println("Completed");
//             } catch (InterruptedException e) {
//                 System.out.println("Thread Interrupted!");
//             }
//         });

//         t1.start();

//         try {
//             Thread.sleep(2000);
//         } catch (Exception e) {
//         }

//         t1.interrupt(); // t1 is interrunpted by main thread
//     }
// }



// important interrupt method


class Demo3 {
    public static void main(String[] args) {
        // Thread t1 = new Thread(() -> {

        //     while(true){
        //         System.out.println("Running...");
        //     }
        // });


        Thread t2 = new Thread(() -> {

            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Running...");
            }

        });


        // t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } 
        catch (Exception e) {
        }

        t2.interrupt(); // t1 is interrunpted by main thread
    }
}