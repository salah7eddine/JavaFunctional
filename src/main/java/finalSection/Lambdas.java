package finalSection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

      /*  Function<String, String> upperCaseName = name -> {
            // logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };*/

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            // logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Mizo", 25));

    }

}


/*
*
* Pure functional programing has a set of rules to follow
* - No state
* - Pure Functions
* - No Side Effects
* - Higher Order Functions
*   * The function takes one or more functions as parameters.
*   * The function returns another function as result.
*
*
* */