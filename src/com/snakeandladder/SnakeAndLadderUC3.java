package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadderUC3 {
    public static final int IS_LADDER = 1;
        public static final int IS_SNAKE = 2;

        public static void main(String[] args) {
            int pos = 0;
            Random random = new Random();
            int dice_throw = random.nextInt(3);
            int dice = random.nextInt(7);
            switch (dice_throw) {
                case IS_LADDER:
                    pos = pos + dice;
                    System.out.println("In case of Ladder, Position of player: " + pos);
                    break;
                case IS_SNAKE:
                    pos = pos - dice;
                    System.out.println("In case of Snake, Position of player: " + pos);
                    break;
                default:
                    System.out.println("In case of no play, Position of Player: " + pos);
            }
        }
    }
