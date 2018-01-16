package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    int number;
    int maxNumber;
    Scanner scanner = new Scanner(System.in);

    public void setMaxNumber(int max){this.maxNumber = max;}

    public int getMaxNumber(){return this.maxNumber;}

    public GuessTheNumber(int maxNumber){
        setMaxNumber(maxNumber);
        Random rand = new Random();
        number = Math.abs(rand.nextInt()) % maxNumber + 1;
    }

    public void playGame(){
        while(true) {
            int move = scanner.nextInt();
            if (move > number) {
                System.out.println("Your number is too big, Please try again..");
            } else if (move < number) {
                System.out.println("Your number is too small, Please try again..");
            } else {
                System.out.println("Your guess is correct..!!!");
                break;
            }
        }
    }
}
