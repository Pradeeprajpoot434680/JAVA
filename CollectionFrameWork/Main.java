public class Main {

    public static void main(String[] args) {

        // NumberBox box =
        //         new NumberBox();

        // MyIterator<Integer> itr =
        //         box.iterator();

        // while(itr.hasNext()) {

        //     System.out.println(
        //             itr.next()
        //     );

        // }



         MyCollection<Integer> list = new MyArrayCollection<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.size());

        System.out.println(
                list.contains(20)
        );

        list.remove(20);

        MyIterator<Integer>
                itr =
                list.iterator();

        while(
                itr.hasNext()
        ){

            System.out.println(
                    itr.next()
            );

        }

    }

}