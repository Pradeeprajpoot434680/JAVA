interface MyRunnable {
    void run();
}

class MyThread implements MyRunnable {
    MyRunnable target;
    MyThread(){

    }
    MyThread(MyRunnable target){
        this.target=target;
    }


    public synchronized void start(){
        // create a new thread


        // in the last
        target.run();
    }

    @Override
    public void run(){
        if(target != null){
            target.run();
        }
    }
}

class CreateThread implements MyRunnable {
    @Override
    public void run(){

    }
}

class CreateThreadByThreadClass extends MyThread {
    @Override
    public void run(){
        // write my logic
    }
}
class ConceptualThread {
    public static void main(String args[]){

        MyRunnable myRunnable = new CreateThread();
        MyThread t1 = new MyThread(myRunnable);

        t1.run();
    }
}