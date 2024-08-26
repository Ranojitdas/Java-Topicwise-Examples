package Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        Vehicle car = new Car(4);
        car.commute();
        car.getSetGo();
        Vehicle veh = new Vehicle() ;
        }
    }



}
