public class Demo4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            try{

            Thread.sleep(3000);

            }

            catch(Exception e){}


        });

        System.out.println(t1.isAlive());
        t1.start();

        System.out.println(t1.isAlive());

        try {
           Thread.sleep(4000);
        } catch (Exception e) {

        }

         System.out.println(t1.isAlive());
    }
}
