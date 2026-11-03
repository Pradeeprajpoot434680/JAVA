// /**
//  * Runnable
//  */
// interface Runnable {
//     void run();
// }
    
// class Thread {
//     Runnable thread;

//     Thread(Runnable runnable){
//         this.thread = runnable;
//     }

//     void run(){

//     }
//     void start(){
//         // create a new thread

//         thread.run();
//     }
// }
// class MyRunnable implements  Runnable {
//     @Override 
//     public  void run(){

//     }
    
// }


// public class Main {
//     public static void main(String[] args) {
//         MyRunnable r1 = new MyRunnable();

//        Thread t1 = new Thread(r1);

//        t1.start();

//     }
// }

// public class Main {

//     public static void main(String[] args) throws Exception{

//         Thread t1 = new Thread(() -> {

//             while (true) {
//                 System.out.println("Daemon running");
//             }

//         });

//         t1.setDaemon(true);

//         t1.start();
//         Thread.currentThread().sleep(10);
//         System.out.println("Main completed");
//     }
// }
