package com.hugonistal;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	    int value = 1;
	    if(value == 1){
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

	    int switchValue = 4;
	    switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Values was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
                break;
        }
        char chartValue = 'A';
	    switch (chartValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(chartValue + " was found");
                break;
            default:
                System.out.println("Could not find any");
                break;
        }
        String month = "jaNuary";
	    switch (month.toLowerCase()){
            case "january":
                System.out.println("It's January");
                break;
            case "june":
                System.out.println("It's June");
                break;
            default:
                System.out.println("Not January or June");
                break;
        }
        printDayOfTheWeek(3);

        }
    private static void  printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }

}
