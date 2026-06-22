class MyThread extends Thread {
    @Override
    public void run(){
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " -> Running...");
        } catch (Exception e) {

        }
    }
}

class MyThread2 extends Thread {
    @Override 
    public void run(){
        System.out.println(Thread.currentThread().getName() + " -> Running...");
        System.out.println(Thread.currentThread().getState());
    }

    void printState(Thread t1){
        System.out.println(t1.getState());
    }
}

public class Demo2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        t2.printState(t1);
        
    }
}
