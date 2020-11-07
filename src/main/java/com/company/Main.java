package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        Mine mine = new Mine();
//        Miner miner = new Miner();
//        Demolitionist demolitionist = new Demolitionist();
//        System.out.println(miner.toString());
//        System.out.println(demolitionist.toString());
//
//        GoodMiner gm = new GoodMiner();
//gm.toString()
        /* sadasdsadsadsd */
        ArrayList<String> al = new ArrayList<String>();
        LinkedList<String> ll = new LinkedList<String>();


        List<String> list = getList();
        list.remove(0);

    }


    public static List<String> getList(){
        List<String> list = new ArrayList<String>();
        list.add("hi");
        return list;
    }

    public static Mine checkMine(Mine mine) {

        if (mine.getDiamonds() == 0) {
            return new Mine();
        }
        return mine;
    }


}
