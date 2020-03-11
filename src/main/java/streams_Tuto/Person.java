package streams_Tuto;

public class Person {

    private final String name;
    private final int age;
    private final Gender gendre;


    public Person(String name, int age, Gender gendre) {
        this.name = name;
        this.age = age;
        this.gendre = gendre;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGendre() {
        return gendre;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gendre='" + gendre + '\'' +
                '}';
    }
}