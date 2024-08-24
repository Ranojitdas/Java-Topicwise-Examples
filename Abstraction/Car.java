package Abstraction;

public class Car extends Vehicle {
    private int numberOfDoors;
    public Car(int numberOfTyres) {
        super(4);
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to place");
    }
}
