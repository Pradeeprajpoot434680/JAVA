// create thread by thread class

class CreateThreadByThreadClass extends Thread {
    @Override
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class CreateThreadByRunnableInterface implements Runnable {
    @Override
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        CreateThreadByThreadClass t1 = new CreateThreadByThreadClass();
        t1.start();

        CreateThreadByRunnableInterface runnableInterface = new CreateThreadByRunnableInterface();
        Thread t2 = new Thread(runnableInterface);

        t2.start();

        System.out.println("Main Thread Ends");
    }
}
