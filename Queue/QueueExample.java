import java.util.*;

class QueueExample {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        q.peek();
        q.poll();

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }
    }
}