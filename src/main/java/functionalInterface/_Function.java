package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;
/*
The Java Function interface (java.util.function.Function) interface is one of the most central functional interfaces in Java.
The Function interface represents a function (method) that takes a single parameter and returns a single value.
Here is how the Function interface definition looks:

            public interface Function<T,R> {
                public <R> apply(T parameter);
            }

The Function interface actually contains a few extra methods in addition to the methods listed above,
but since they all come with a default implementation, you do not have to implement these extra methods. The extra methods will be explained in later sections.
The only method you have to implement to implement the Function interface is the apply() method.
*
* */
public class _Function {

    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result

        int inc = incrementByOne(0);
        System.out.println(inc);

        int inc2 = incrementByOneFunction.apply(1);
        System.out.println(inc2);

        int multiply = multipleBy10Function.apply(inc2);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multipleBy10Function);

        System.out.println(addByOneAndThenMultiplyBy10.apply(4));

        // BiFunction takes 2 argument and produces 1 result
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4, 100)
        );

        System.out.println(
                incrementByOneAndMultiply(4, 100)
        );
    }


    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static  Function<Integer, Integer> multipleBy10Function = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiply) -> (numberToIncrementByOne + 1) * numberToMultiply;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}