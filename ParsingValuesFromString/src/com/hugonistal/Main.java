package com.hugonistal;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
	    int number = Integer.parseInt(numberAsString);
	    numberAsString = "2018.0";
	    double numberDouble = Double.parseDouble(numberAsString);
        System.out.println(numberDouble);
    }
}
