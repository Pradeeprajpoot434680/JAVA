
class Box {
    String[] queue = new String[10];
    int currIndex = 0;

    synchronized void readValue() {
        while (currIndex == 0) {
            try {
                wait();
            } catch (Exception e) {}
        }

        String value = queue[currIndex - 1]; // take last item
        currIndex--;

        System.out.println(Thread.currentThread().getName() + " Read value " + value);

        notifyAll();
    }

    synchronized void setValue(int x) {

        while (currIndex >= 10) {
            try {
                wait();
            } catch (Exception e) {}
        }

        String message =
            Thread.currentThread().getName() + " added number " + x;

        queue[currIndex] = message;
        currIndex++;

        System.out.println(message);

        notifyAll();
    }
}

public class Demo2 {
    public static void main(String[] args) throws Exception {

        Box box = new Box();

        //  Producers in loop
        Thread p1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                box.setValue(i);
               
                try {
                     Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        });

        Thread p2 = new Thread(() -> {
            for (int i = 100; i < 110; i++) {
                box.setValue(i);
                try {
                    Thread.sleep(150);
                } catch (Exception e) {
                }
            }
        });

        Thread p3 = new Thread(() -> {
            for (int i = 200; i < 210; i++) {
                box.setValue(i);
                try {
                    Thread.sleep(150);
                } catch (Exception e) {
                }
            }
        });

        //  Consumers in loop
        Thread c1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                box.readValue();
try {
                    Thread.sleep(150);
                } catch (Exception e) {
                }
            }
        });

        Thread c2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                box.readValue();
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
        });

        Thread c3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                box.readValue();
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        });

        // start
        p1.start();
        p2.start();
        p3.start();

        c1.start();
        c2.start();
        c3.start();

        // wait
        p1.join();
        p2.join();
        p3.join();

        c1.join();
        c2.join();
        c3.join();

        System.out.println("Final Index: " + box.currIndex);
    }
}