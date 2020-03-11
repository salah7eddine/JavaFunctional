package streams_Tuto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach X

      /*  System.out.println("Imperative approach");

        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if(person.getGendre().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        females.forEach(System.out::println);*/

        // Declarative approach V


        // Filter
        System.out.println("Declarative approach");

        List<Person> females = people.stream()
                .filter(person -> person.getGendre().equals(Gender.FEMALE))
                .collect(Collectors.toList());
//        females.forEach(System.out::println);

        // Sort

        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGendre).reversed())
                .collect(Collectors.toList());

//        sorted.forEach(System.out::println);

        // All match

        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 3);

//        System.out.println(allMatch);
        // Any match
        boolean anyMatch= people.stream().anyMatch(person -> person.getAge() > 18);

//        System.out.println(anyMatch);
        // None match
        boolean noneMatch = people.stream().noneMatch(person -> person.getName().equals("Mizo"));

//        System.out.println(noneMatch);

        // Max
//        people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);


        // Min
//        people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        // Group
   /*     people.stream().collect(Collectors.groupingBy(Person::getGendre)).forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });*/

        people.stream()
                .filter(person -> person.getGendre().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName).ifPresent(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Mizo Killua", 25, Gender.MALE),
                new Person("Mery Imey", 18, Gender.FEMALE),
                new Person("Gone Gone",26 , Gender.MALE),
                new Person("Mimi Nice",5, Gender.FEMALE),
                new Person("Nini Nice", 15, Gender.FEMALE),
                new Person("Nono Nice", 22, Gender.MALE),
                new Person("Nano Nice", 7, Gender.MALE),
                new Person("Nana Nice", 10, Gender.FEMALE)
        );
    }
}
