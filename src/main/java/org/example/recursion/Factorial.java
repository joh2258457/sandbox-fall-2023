package org.example.recursion;

public class Factorial {
private static int counter = 0;
    public static int factorialIterative(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;

    }

    public static int factorialRecursive(int n) {
        System.out.println(++counter);

        //base case
//        if (n == 0) {
//            return 1;
//        }
        //recursive call 0(n) - save the state of the variables in a call stack - it goes and save the state of the method

        return n * factorialRecursive(n - 1);
    }
    public static void main(String[] args) {
//        System.out.println(Factorial.factorialIterative(10));

        //big o n (slower performance)
        for (int x = 1; x<=10;x++) {
//            System.out.println(factorialIterative(x));
            System.out.println(factorialRecursive(x));
        }
    }
}
