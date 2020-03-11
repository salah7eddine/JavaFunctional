package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Object value = Optional.ofNullable(null).orElseGet(() -> "default value");
        Object value1 = Optional.ofNullable("Hello").orElseGet(() -> "default value");
        Object value2 = Optional.ofNullable("Hello").orElseThrow(() -> new IllegalArgumentException("exception"));

//        System.out.println(value);
//        System.out.println(value1);
//        System.out.println(value2);

//       Optional.ofNullable("mery@gmail.com").ifPresent(System.out::println);
//       Optional.ofNullable("mery@gmail.com").ifPresent(email -> System.out.println("Sending email to " + email));
//       Optional.ofNullable(null).ifPresent(email -> System.out.println("Sending email to " + email));
       Optional.ofNullable(null)
               .ifPresentOrElse(
                       email -> System.out.println("Sending email to " + email),
                       () -> {
                           System.out.println("Cannot send email");
                       }
                       );

    }
}
