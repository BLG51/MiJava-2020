package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Mine mine = new Mine();
        Miner miner = new Miner();
        Demolitionist demolitionist = new Demolitionist();
        System.out.println(miner.toString());
        System.out.println(demolitionist.toString());




        /* sadasdsadsadsd */


        while(true) {
            System.out.println("Сколько выкопать алмазов?");
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            if (amount <= 0) {
                System.out.println("выкопано всего " + miner.getDiamonds());
                break;
            } else {
                mine = checkMine(mine);
                System.out.println("выкопано  " + miner.kopat(mine, amount));
            }
        }



    }

    public static Mine checkMine(Mine mine) {

        if (mine.getDiamonds() == 0) {
            return new Mine();
        }
        return mine;
    }


}
