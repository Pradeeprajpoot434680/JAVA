package Enums;
/*
    Predeifned Set of Constants
    Enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    => Convert into Class
*/

import java.lang.annotation.Inherited;

// final class Direction {

//     public static Direction NORTH = new Direction();
//     public static Direction SOUTH = new Direction();
//     public static Direction EAST = new Direction();
//     public static Direction WESR = new Direction();

//     private Direction(){

//     }

// }



/*
    Fields in ENUMS

*/


// enum Direction {
//     EAST(0),
//     WEST(180),
//     NORTH(90),
//     SOUTH(270);

//     public int degree;

//     Direction(int degree) {
//         this.degree = degree;
//     }
// }



// final class Direction {
//     public int degree;
//     public static Direction NORTH = new Direction(180);
//     public static Direction SOUTH = new Direction(270);
//     public static Direction EAST = new Direction(0);
//     public static Direction WESR = new Direction(90);



//     private Direction(int degree){
//         this.degree = degree;
//     }

// }


/*
    Methods in ENUMS

*/



enum Direction {
    EAST {
        @Override
        public void move(){
            System.out.println("We are moving in EAST direction");
        }

    },
    WEST {
        @Override
        public void move(){
            System.out.println("We are moving in WEST Diection");
        }
    },
    NORTH {
        @Override
        public void move(){
             System.out.println("We are moving in NORTH Diection");
        }

    },
    SOUTH {
        @Override
        public void move(){
             System.out.println("We are moving in South Diection");
        }
    };

    private Direction(){

    }

    public abstract void move();
}


public class Introduction {
    public static void main(String[] args) {
        // Direction e = Direction.EAST;
        // int deg = e.degree;

        Direction e = Direction.EAST;
        e.move();
        Direction[] d = Direction.values();
        System.out.println(d[0]);

    }
}
