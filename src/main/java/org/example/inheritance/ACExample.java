package org.example.inheritance;
//Composition and Aggregation not mutually exclusive (you can have them both in the same class)
public class ACExample {
    public static void main(String[] args) {
//        THis example of aggregation
        Example1 aggr = new Example1();
        Example1 aggr2 = new Example1("Hello, world!");
    }
}
