package com.snakeandladder;

import java.util.Random;

public class SnakeAndLadderUC2 {
    public static void main(String[] args) {
        int pos=0;
        Random random=new Random();
        int dice= random.nextInt(7);
        if(dice>0) {
            pos = pos + dice;
            System.out.println("After Throwing dice Position of the player: "+pos);
        }else System.out.println("After Throwing dice Position of the player: "+pos);
    }
}
