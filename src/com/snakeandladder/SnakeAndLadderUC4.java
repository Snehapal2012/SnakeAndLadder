package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadderUC4 {
        public static final int IS_LADDER=1;
        public static final int IS_SNAKE=2;
        public static void main(String[] args) {
            int pos = 0;
            while (pos <= 100) {
                if(pos>=100){break;}
                else {
                    Random random = new Random();
                    int dice_throw = random.nextInt(3);
                    int dice = random.nextInt(7);
                    if (dice_throw==IS_LADDER && pos<=94) {
                        pos = pos + dice;
                        System.out.println("In case of Ladder, Position of player: " + pos);
                    } else if (dice_throw==IS_SNAKE && pos>=6) {
                        pos = pos - dice;
                        System.out.println("In case of Snake, Position of player: " + pos);
                    }
                    else
                    {System.out.println("In case of no play, Position of Player: " + pos);
                    }}
            }
        }
}
