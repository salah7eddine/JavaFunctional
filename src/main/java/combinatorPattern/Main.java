package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+08987878787898",
                LocalDate.of(2000, 1, 1)
        );

        /*CustomerValidatorService validatorService =
                new CustomerValidatorService();
        validatorService.isValid(customer);*/

        // if valid we can store customer in db

        // Using combinator pattern
        ValidationResult result =
                isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }
}