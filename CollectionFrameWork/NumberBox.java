public class NumberBox implements MyIterable<Integer>{

    private Integer[] arr = {10,20,30};

    public MyIterator<Integer> iterator(){
        return new NumberIterator();
    }

    class NumberIterator implements MyIterator<Integer> {
        int cursor = 0;

        public boolean hasNext(){
            return cursor < arr.length;
        }


        public Integer next() {

            return arr[cursor++];

        }
    }
    
}
