import java.util.*;

class StackExample {
    public static void main(String []arg){
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st.search(10));
        st.pop();
        st.peek();
        while(!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }
        System.out.println("Stack size is:"+ st.size());

        st.clear();//remove all the elements
    }
}