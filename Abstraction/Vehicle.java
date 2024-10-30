package Abstraction;

public abstract class Vehicle implements Transportation {
    private int  numberOfTyres;

    public Vehicle(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public void commute(){
        System.out.println("going");
    }
}


