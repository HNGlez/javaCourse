package com.hugonistal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt) {
//
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            int age = 2020 - yearOfBirth;
//            System.out.println(name + " is " + age + " years old");
//        } else {
//            System.out.println("Character is not number");
//        }
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
//        int sum = 0;
//        while (true){
//            int order = counter + 1;
//            System.out.println("Enter number #" + order + ":");
//            boolean isAnInt = scanner.hasNextInt();
//            if (isAnInt){
//                int number = scanner.nextInt();
//                sum += number;
//                counter++;
//                if (counter == 10){
//                    break;
//                }
//            } else {
//                System.out.println("Invalid Number");
//            }
//            scanner.nextLine(); // handle end of line (enter key)
//
//        }
//        System.out.println("Sum equals " + sum);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        int counter = 0;
        while (true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (first){
                    min = number;
                    max = number;
                    first = false;
                }
                min = Math.min(min, number);
                max = Math.max(max, number);
                counter++;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("min= " + min + ", max=" + max);
        scanner.close();
    }

}
