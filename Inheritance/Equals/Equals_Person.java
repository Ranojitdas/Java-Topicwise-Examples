package Inheritance.equals;

import java.util.Objects;

public class Equals_Person {
    private String name;
    private int age;
    private String id;

    public Equals_Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "equals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Equals_Person)){
            return false;
        }
        Equals_Person per = (Equals_Person)obj;
        return per.age == age &&
               per.name.equals(name) &&
                per.id.equals(id);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
