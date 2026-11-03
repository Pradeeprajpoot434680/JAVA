class MyThread extends  Thread {
    @Override 
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("Thread1 :"+i);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for(int i=0; i<1000; i++){
            System.out.println("Main Thread:"+i);
        }
    }
    
}
