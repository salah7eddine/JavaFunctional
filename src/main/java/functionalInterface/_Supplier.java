package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

/*
The Java Supplier interface is a functional interface that represents an function that supplies a value of some sorts.
The Supplier interface can also be thought of as a factory interface. Here is an example implementation of the Java Supplier interface:

    Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));

This Java Supplier implementation returns a new Integer instance with a random value between 0 and 1000.
* */

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectioUrl());
        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConnectioUrl() {
        return "jdbc://localhost:5431/users";
    }

    static Supplier<List<String>> getDBConnectionUrlsSupplier = () ->
            List.of(
                    "jdbc://localhost:5430/users",
                    "jdbc://localhost:5430/customer"
            );

    /*
    * benefits to knowing the function interface is one use the Optional & the Streams,
    *  when we use the function interface we start to use a clean code.
    * */

}
