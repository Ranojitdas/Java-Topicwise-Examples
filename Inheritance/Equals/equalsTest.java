package Inheritance.equals;

public class equalsTest {
    public static void main(String[] args) {
        Equals_Person Person1 = new Equals_Person("Robin",45,"001");
        Equals_Person Person2 = new Equals_Person("Robin",45,"001");
        if (Person1 == Person2){
            System.out.println("True");
        }
        else System.out.println("False");


        if (Person1.equals(Person2)){
            System.out.println("True");
        }
        else System.out.println("False");

        System.out.println(Person1.hashCode());

        System.out.println(Person2.hashCode());
        System.out.println(Person1.equals(Person2));

        Equals_Person Person3 = new Equals_Person("Robin",45,"003");
        int h = Person3.hashCode();
        System.out.println(h);
        System.out.println(Person3.equals(Person2));
        System.out.println(Person3.equals(Person1));
    }

}
