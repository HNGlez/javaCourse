package com.hugonistal;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20/5 = 4
        System.out.println("20 / 5 = " + result);
        result = result % 3; // the remainder of 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result ++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3

        // result = result * 10
        result *= 10; // 3 * 10 = 30

        // result = result / 3
        result /= 3; // 30 /3 = 10

        // result = result - 2
        result -= 2; // 10 - 2 = 8

        // If then statement:
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!"); // When the ; are used then the if statements ends

        // Code Block
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        // Comparison operators: == , != , > , < , >= , <= , && , || , ! ,& , |
        // && and || are logical operators to compare booleans
        // & and | are bitwise operators working at the bit level.
        int topScore = 80;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || ( secondTopScore <= 90)){
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        // ! is the NOT operator.

        // Ternary Operator
        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen.");
        }

        boolean wasCar = isCar ? true : false; // If isCar == True then wasCar = true else wasCar = false
        int ageOfClient = 20;

        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;

        // Operator Precedence
        double myDouble = 20.00;
        double secondDouble = 80.00;
        double resultChallenge = (myDouble + secondDouble) * 100.00;
        double remainderChallenge = resultChallenge % 40.00;
        boolean isRemainderZero = (remainderChallenge == 0) ? true : false;
        System.out.println(isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Print some remainder");
        }



    }
}
