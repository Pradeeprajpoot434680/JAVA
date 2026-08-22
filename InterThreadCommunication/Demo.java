class Box {
    Integer queue  = null;

    synchronized void readValue(){

        while(queue == null){
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " Read value "+ queue);
        queue = null;
        notifyAll();
    }

    synchronized void setValue(int x){
        while(queue != null){
            try {
                wait();
            } catch (Exception e) {

            }
        }
        this.queue = x;
        System.out.println("Thread " + Thread.currentThread().getName() + " Set value "+ x);
        notifyAll();

    }


}


public class Demo {
    public static void main(String[] args) throws Exception {
        Box box = new Box();

        Thread p1 = new Thread(()->box.setValue(5));
        Thread p2 = new Thread(()->box.setValue(7));
        Thread p3 = new Thread(()->box.setValue(35));


        Thread c1 = new Thread(()-> box.readValue());
        Thread c2 = new Thread(()-> box.readValue());
        Thread c3 = new Thread(()-> box.readValue());


        p1.start();
        p2.start();
        p3.start();

        c1.start();
        c2.start();
        c3.start();

        p1.join();
        p2.join();
        p3.join();

        c1.join();
        c2.join();
        c3.join();

System.out.println("Final Value: " + box.queue);


    }
}
