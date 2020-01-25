package com.hugonistal;

public class Main {

    public static void main(String[] args) {
        // Primitive types:
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        // Most common int, double, boolean.

        // Strings are not a primitive class, but java treats them very similarly.
        String myString = "This is a string";
        System.out.println("myString is equalt to " + myString);
        myString = myString + ", this is more";
        System.out.println("myString is equalt to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equalt to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // myInt treated as a string here. Same with doubles
        System.out.println("LastString is equal to " + lastString);

        // Strings in java are immutable. You can't change a string once its created. Java creates a new one.


    }
}
