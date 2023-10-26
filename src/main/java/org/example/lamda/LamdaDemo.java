package org.example.lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaDemo {
    public static void main(String[] args) {
        //x -> x + 2 (this is a lamda)
//        Predicate - takes 1 value return a boolean
//        if(condition) {
//         this is an example of that
//        }
//        There is also a class for that its called Predicate
//        Look up imperative programiing - its the contrat declarative of programming - lamdas is functional programming - not imperative (declarative)
        Predicate<String> predicate = x -> x.startsWith("a");
    }

    public int addTwo(int x) {
        return x+2; //same thing as x -> x+2 // it's an anynomous function (it has not name that what a lamda is)
    }

//    Function - takes 1 value and returns 1 values
    Function<Integer, Integer> function = x -> x + 2;

//    Supplier - take nothing and returns 1 value
    Supplier<String> supplier = () -> "Hello Lamda!";

//    Consumer - takes 1 values and returns nothing
    Consumer<String> consumer = x -> System.out.println(x);
    Consumer<String> consumer1 = System.out::println; //Same way to write it

}
