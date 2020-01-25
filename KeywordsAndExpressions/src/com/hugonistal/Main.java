package com.hugonistal;

public class Main {

    public static void main(String[] args) {
        // Anything in orange is a reserved keyword.

        // a mile is equal to 1.609344 km
        // double and ; are not part of the expression.
        // the whole line is a statement
        double kilometres = (100 * 1.069344);

        // only kilometres > 100 and "More than 100 km" are expressions, not the rest.
        // Statements can be in multiple line
        if (kilometres > 100) {
            System.out.println("More than 100 km");
        }

        // There can be multiple statements in the same line
        int anotherVariable = 50;
        int myVariable = 100;
        // There can be multiple spaces or line breaks
        int testVariable =
                50;

        // Indentation it is not required but recommended.

        boolean gameOver = true;
        int score = 400;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println(("Your score less than 5000 but greater than 1000"));
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got Here");
        }
        // When a code block ends it deletes any variables created in the code block
        // You can access variable created outside a code block from a code block but not the opposite.

    }
}
