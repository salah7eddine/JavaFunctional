package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;

public class Main {

    // psvm
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Mizo", Gender.MALE),
            new Person("Mery", FEMALE),
            new Person("Momo", Gender.MALE),
            new Person("Mimi", FEMALE),
            new Person("Nada", FEMALE),
            new Person("Nono", Gender.MALE)
        );

        System.out.println("Imperative approach");
        // Imperative approach
        // a lot of code
        List<Person> females = new ArrayList<Person>();

        for (Person person: people) {
            if(FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("Declarative approach");
        // Declarative approach

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        people.stream()
                .filter(personPredicate)
//                .collect(Collectors.toList())
                .forEach(System.out::println);

        /*List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);*/
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}
