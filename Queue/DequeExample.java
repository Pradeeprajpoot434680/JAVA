import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer>dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.removeFirst();
        dq.peekFirst();
        dq.peekLast();
    }
}
