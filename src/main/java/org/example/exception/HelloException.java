package org.example.exception;

import java.util.Scanner;

public class HelloException {

    public static void main(String[] args) {
        //try-catch block
        try {

        }
//    Do something
        catch (Exception e) {
//        Do something if exception is thrown

        }
        //do other stuff

//Try-catch-catch block


        try {

        } catch (
                NullPointerException npse) {      //More specific exception on top or aka the child exception so you dont get an error
//            do something if NullPointerException is thrown
        }
//    Do something
        catch (Exception e) {
//        Do something if exception is thrown

        }

        try {

        } catch (Exception e) {

        } finally {
            // always get executed whether there is an exception or not
        }


//        java 7 multi-try-catch
        try {

        } catch (ArithmeticException | NullPointerException e) {

        }

//        try-with-resources
        try(Scanner scanner1 = new Scanner(System.in)) {
//            do something
        }

//        Or add multiple
        try(Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in)) {
//            do something
        }



        //

    }

}
