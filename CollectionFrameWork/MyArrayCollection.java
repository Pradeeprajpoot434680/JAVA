class MyArrayCollection<T>
        implements MyCollection<T> {

    private Object[] data =
            new Object[10];

    private int size = 0;

    public boolean add(T element) {

        data[size++] = element;

        return true;

    }

    public boolean remove(T element) {

        for(int i=0;i<size;i++) {

            if(data[i].equals(element)) {

                shiftLeft(i);

                size--;

                return true;

            }

        }

        return false;

    }

    private void shiftLeft(int index){

        for(int i=index;
            i<size-1;
            i++) {

            data[i]=data[i+1];

        }

    }

    public boolean contains(
            T element) {

        for(int i=0;i<size;i++) {

            if(data[i]
                    .equals(element))
                return true;

        }

        return false;

    }

    public int size() {

        return size;

    }

    public boolean isEmpty() {

        return size==0;

    }

    public void clear() {

        size=0;

    }

    public MyIterator<T>
    iterator() {

        return new ArrIterator();

    }

    private class ArrIterator
            implements MyIterator<T> {

        int cursor=0;

        public boolean hasNext(){

            return cursor<size;

        }

        @SuppressWarnings(
                "unchecked"
        )
        public T next(){

            return
            (T)data[cursor++];

        }

    }

}