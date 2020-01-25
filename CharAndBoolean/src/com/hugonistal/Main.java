package com.hugonistal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        char myChar = 'D'; // Single quotes for chars, double quotes for strings.
        char myUnicodeChar = '\u0044'; // To represent chars in unicode encoding format. unicode-table.com

        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char copyright = '\u00A9';
        System.out.println(copyright);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverEighteen = true;
    }
}
