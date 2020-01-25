package com.hugonistal;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highscore = calculateScore(true , 800, levelCompleted, bonus);
        System.out.println("Your final score was " + highscore);

        highscore =  calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highscore);


        int highScorePosition = calculateHighScorePosition(15000);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    // Void means that the method does not return anything. If we want to return something we need to indicate the data type
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }
}
