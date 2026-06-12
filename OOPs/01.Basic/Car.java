class Car {
    String color;
    int speed;

    Car(){
        speed=0;
        color="red";
    }

    Car(int speed,String color){
        this.color=color;
        this.speed=speed;
    }


    void start(){
        System.out.println("Car is started with speed :"+speed + " and color of car is:"+color);
    }
};

class Main {
    public static void main(String arg[]){
        Car c = new Car(20,"black");
        c.start();
    }
}