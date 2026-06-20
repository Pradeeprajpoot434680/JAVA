public class LocalInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}

//11. Local Class Cannot Have Access Modifiers beacuse it has the scope
// class Outer {
//     public void show(){


//         class Inner {
//             void display(){
//                 System.out.println("Showing the data");
//             }
//         }

//         Inner i = new Inner();
//         i.display();

//     }
// }

//3.Scope Rules (Very Important)
// -> not Allowed
// void method() {

//     class Local {

//     }

// }

// void another() {

//     Local obj;

// }


class Outer {

    int x = 100;

    void display() {
        int y = 10;
        // y++;-> can not do that
        class Local {

            void show() {

                System.out.println(y);

            }

        }

        new Local().show();

    }

}