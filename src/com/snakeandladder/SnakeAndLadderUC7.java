package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadderUC7 {
    public static final int IS_LADDER=1;
    public static final int IS_SNAKE=2;
    public static void main(String[] args) {
        int pos1 = 0,count1=0,pos2=0,count2=0;
        while (pos1 <= 100) {
            count1=count1+1;
            if(pos1>=100){break;}
            else {
                Random random = new Random();
                int dice_throw1 = random.nextInt(3);
                int dice1 = random.nextInt(7);
                if (dice_throw1==IS_LADDER && pos1<=94) {
                    count1=count1+1;
                    pos1 = pos1 + dice1;
                    if(dice_throw1==IS_LADDER && pos1<=94){
                        pos1=pos1+dice1;}
                    else if (dice_throw1==IS_SNAKE && pos1>=6) {
                        pos1 = pos1 - dice1;
                    }
                    else
                    {
                        continue;
                    }
                }
                else if (dice_throw1==IS_SNAKE && pos1>=6) {
                    pos1 = pos1 - dice1;
                }
                else
                {continue;
                }}
        }
        System.out.println("The number of times the dice played for win the game of PLAYER1: "+ (count1-1));
        while (pos2 <= 100) {
            count2=count2+1;
            if(pos2>=100){break;}
            else {
                Random random = new Random();
                int dice_throw2 = random.nextInt(3);
                int dice2 = random.nextInt(7);
                if (dice_throw2==IS_LADDER && pos2<=94) {
                    count2=count2+1;
                    pos2 = pos2 + dice2;
                    if(dice_throw2==IS_LADDER && pos2<=94){
                        pos2=pos2+dice2;}
                    else if (dice_throw2==IS_SNAKE && pos2>=6) {
                        pos2 = pos2 - dice2;
                    }
                    else
                    {
                        continue;
                    }
                }
                else if (dice_throw2==IS_SNAKE && pos2>=6) {
                    pos2 = pos2 - dice2;
                }
                else
                {continue;
                }}
        }
        System.out.println("The number of times the dice played for win the game of PLAYER2: "+ (count2-1));
        if(count1>count2){
            System.out.println("PLAYER1 is the WINNER !");}
        else if (count1<count2) {
            System.out.println("PLAYER2 is the WINNER !");}
        else {
            System.out.println("GAME is DRAW !");
        }
    }
}
