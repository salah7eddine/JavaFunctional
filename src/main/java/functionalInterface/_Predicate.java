package functionalInterface;

import java.util.function.Predicate;
/*
The Java Predicate interface, java.util.function.Predicate, represents a simple function that takes a single value as parameter, and returns true or false.
Here is how the Predicate functional interface definition looks:

    public interface Predicate {
        boolean test(T t);
    }

The Predicate interface contains more methods than the test() method, but the rest of the methods are default or static methods which you don't have to implement.

You can implement the Predicate interface using a class, like this:

public class CheckForNull implements Predicate {
    @Override
    public boolean test(Object o) {
        return o != null;
    }
}

You can also implement the Java Predicate interface using a Lambda expression.
Here is an example of implementing the Predicate interface using a Java lambda expression:

Predicate predicate = (value) -> value != null;
This lambda implementation of the Predicate interface effectively does the same as the implementation above that uses a class.
* */
public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000000000"));
        System.out.println(isPhoneNumberValid("070003300000"));
        System.out.println(isPhoneNumberValid("0700033045"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("08000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("070675000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0706850000"));

        System.out.println(
                "07000056000 Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("07000056000")
        );
        System.out.println(
                "07003056000 Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("07003056000")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return  phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
