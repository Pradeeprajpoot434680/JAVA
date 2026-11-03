/*
Runnable has one limitation:

It cannot directly return a result from its run() method.

Callable:

    Can return a result.
    Can throw checked exceptions.
    Uses the call() method instead of run().


*/

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int x = 10;
        int y = 20;

        return x+y;
    }

}

public class CallableDemo {
    public static void main(String[] args) {
       ExecutorService executor =
                Executors.newSingleThreadExecutor();
        
        Future<Integer> future =
                executor.submit(new MyTask());

        Integer result = future.get();

        System.out.println(result);

        executor.shutdown();


    }
}
