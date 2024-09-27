package Inheritance.rd.inheritance;

public class Vehicle {
    private int numberOfTyres;


    public void setNumberOfTyres(int numberOfTyres){
        this.numberOfTyres = numberOfTyres;
    }

    public void commute(){
        System.out.printf("I am going from place A to place B using %d tires \n", numberOfTyres);
    }
}
