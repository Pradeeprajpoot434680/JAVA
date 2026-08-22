/*
    Deamon Thread Example
*/
public class Demo5 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            while (true) {
                System.out.println("Thread is Running...");
            }
        });

        t.setDaemon(true);
        t.start();

        Thread.sleep(1000);
    }
}
