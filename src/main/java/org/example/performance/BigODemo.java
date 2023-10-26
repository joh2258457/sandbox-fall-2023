package org.example.performance;

import java.util.ArrayList;
import java.util.List;

public class BigODemo {
    public static void main(String[] args) {

        // O(1)
        List<String> list = new ArrayList<>();

        //O(1)
        if (list.size() > 10) {
            //0 (n)
            while (list.size() > 10) {
                //do something, this could be Big 0(1) but it depends on the code, this will affect the performance
            }

            //0 (n)
            while (list.add("value") != false) {

            }
            //if statement are usually 0(1)
            if (list.contains("value")) {
                //do something
            }
        }

        // 1 + 1 + (n + n + 1) = 3 + 2n --> worst case scenario is --> 0(n)

    }
}
