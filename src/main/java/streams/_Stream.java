package streams;


import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {


    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Mizo", MALE),
                new Person("Mery", FEMALE),
                new Person("Momo", MALE),
                new Person("Mimi", FEMALE),
                new Person("Nada", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY),
                new Person("Noni", MALE),
                new Person("Momi", PREFER_NOT_TO_SAY)
        );

     /*   Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);*/

     /*   people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);*/

     boolean containsOnlyFemales = people.stream()
             .allMatch(person -> FEMALE.equals(person.gender));

     boolean containsAnyMatch = people.stream()
             .anyMatch(person -> FEMALE.equals(person.gender));

     boolean _noneMatch = people.stream()
             .noneMatch(person -> PREFER_NOT_TO_SAY.equals(person.gender));

     System.out.println(containsOnlyFemales);
     System.out.println(containsAnyMatch);
     System.out.println(_noneMatch);

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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
