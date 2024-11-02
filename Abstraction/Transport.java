package Abstraction;

public abstract class Transport {
    private int numberOfTyres;

    public Transport(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public void commute(){
        System.out.println("It is going");
    }

}

class Cars extends Transport{


    public Cars(int numberOfTyres, int numberOfDoors) {
        super(numberOfTyres);
    }

    public Cars(int numberOfTyres) {
        super(numberOfTyres);
    }

    public void declaration(){
        System.out.println("It is a "+ getNumberOfTyres() +" wheeler");
    }
}

class TransportTest{

    public static void main(String[] args) {
        Cars car = new Cars(4,2);
        car.commute();
        car.declaration();
        car.
//        car.equals();

    }
}
