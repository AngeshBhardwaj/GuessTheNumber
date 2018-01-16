package com.company;

public class Main {

    public static void main(String[] args) {
        GuessTheNumber gamePlay = new GuessTheNumber(100);
        System.out.println("Welcome to the Game.\nThe Computer has selected a number(Max number is: " + gamePlay.getMaxNumber() + "), can you guess it?\n\n");
        System.out.println("Let's try, Please enter your guess.");
        gamePlay.playGame();
    }
}
