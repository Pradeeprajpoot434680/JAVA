/*
    Movie Ticket Booking System

    A movie theater has 10 seats available.

    Multiple users (threads) try to book seats at the same time.
     Each user requests a certain number of seats.
*/


// class BookingSystem {
//      String seat;

//     BookingSystem(){
//         seat = "EMPTY";
//     }

//     synchronized void bookSeat(String name){

//         if(!seat.equals("EMPTY")){
//             return;
//         }

//         System.out.println("Seat is booked by user:" + name);
//         this.seat = name;
//     }
// }

import java.util.Arrays;

class BookingSystem {
     private String[] seats = new String[8];
     private int currSeatIndex = 0;
    
    
    BookingSystem(){
        Arrays.fill(seats, "EMPTY");
    }

    synchronized void bookSeat(String name){
        if(currSeatIndex>=8 ){
            System.out.println("All Seats are Filled");
            return;
        }

        // not need now
        // while(!seats[currSeatIndex].equals("EMPTY")){
        //     try {
        //         Thread.sleep(100);
        //     } catch (Exception e) {

        //     }
        // }



        seats[currSeatIndex] = "Seat:" + name;
        currSeatIndex++; 

    }


    // in this case race condition will come

    // if currSeatIndex == 7 and 3 threads enters
    // void bookSeat(String name){
    //     if(currSeatIndex>=8 ){
    //         System.out.println("All Seats are Filled");
    //         return;
    //     }

    //     synchronized(this){
    //         seats[currSeatIndex] = "Seat:" + name;
    //         currSeatIndex++;
    //     }
    // }

    void printSeats(){
         for(int i=0; i<seats.length; i++){
            System.out.println("Seat " + i + " is Booked by:" + seats[i]);
        }
    }

}
public class Demo9 {
    public static void main(String[] args) {

        BookingSystem seat = new BookingSystem();

        Thread t1 = new Thread(()->{
            seat.bookSeat("Pradeep");
        });


        Thread t2= new Thread(()->{
            seat.bookSeat("Rahul");
        });
        Thread t3 = new Thread(()->{
            seat.bookSeat("Mohit");
        });
        Thread t4 = new Thread(()->{
            seat.bookSeat("Kishan");
        });
        Thread t5 = new Thread(()->{
            seat.bookSeat("Komal");
        });

        Thread t11 = new Thread(()->{
            seat.bookSeat("ROhit");
        });


        Thread t21= new Thread(()->{
            seat.bookSeat("raman");
        });
        Thread t31 = new Thread(()->{
            seat.bookSeat("kalu");
        });
        Thread t41 = new Thread(()->{
            seat.bookSeat("nishant");
        });
        Thread t51 = new Thread(()->{
            seat.bookSeat("roko");
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t11.start();
        t21.start();
        t31.start();
        t41.start();
        t51.start();


        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }

        seat.printSeats();
       
    }
}
