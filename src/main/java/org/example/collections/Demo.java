package org.example.collections;

//Import eveything from util
import java.util.*;

public class Demo {
    public static void main(String[] args) {
//    Set<String> set = new HashSet<>();

//    Set<String> set = new LinkedHashSet<>();

    Set<String> set = new TreeSet<>();
    set.add("hello");
    set.add("hola");
    set.add("olo");
    set.add("helo");
    set.add("howdy");
    set.add("howdy");

    for (String s : set) {
        System.out.println(s);
    }

        System.out.println("");
    List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hola");
        list.add("olo");
        list.add("howdy");
        list.add("howdy");

        list.forEach(System.out::println);
        System.out.println("");

        Queue<String> queue = new LinkedList<>();
        queue.add("hello");
        queue.add("hola");
        queue.add("olo");
        queue.add("howdy");
        queue.add("howdy");

        queue.remove();

        queue.forEach(System.out::println);

//        Double ended queue
        Deque<String> deck = new LinkedList<>();
        deck.add("hello");
        deck.add("hola");
        deck.add("olo");
        deck.add("howdy");
        deck.add("howdy");

        deck.remove();


    }
}
