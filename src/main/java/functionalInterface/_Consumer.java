package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
The Java Consumer interface is a functional interface that represents an function that consumes a value without returning any value.
A Java Consumer implementation could be printing out a value, or writing it to a file, or over the network etc. Here is an example implementation of the Java Consumer interface:

    Consumer<Integer> consumer = (value) -> System.out.println(value);

This Java Consumer implementation prints the value passed as parameter to it out to System.out.
* */

public class _Consumer {

    public static void main(String[] args) {
        // Normal Java
        Customer mery = new Customer("Meryem", "1237676576");
        greetCustomer(mery);
        greetCustomerV2(mery, false);

        // Consumer Functional interface
        greetCustomerConsumer.accept(mery);
        greetCustomerConsumerV2.accept(mery, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber )->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber : "************"));



    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                (showPhoneNumber ? customer.customerPhoneNumber : "************"));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}