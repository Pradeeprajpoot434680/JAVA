import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorClass {
    public static void main(String[] args) {
       CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(10,20,30));
        Iterator iterator = list.iterator();

        list.add(40);

        while(iterator.hasNext()){
            int ele =(Integer) iterator.next();
            System.out.println(ele);
        }
        System.out.println(list);
    }
}