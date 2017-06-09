package main;

import peopleGroup.PeopleGroup;
import random.AverageRandom;

import java.util.ArrayList;

/**
 * Created by yangzhang on 2017/4/14.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("hello work");
        ArrayList groupList = new ArrayList();
        PeopleGroup group1 = new PeopleGroup();
        PeopleGroup group2 = new PeopleGroup();
        group1.show();
        for (int i=0; i<10; i++){
            System.out.println("==================================");
            System.out.println("round :" + i);
            group1.oneRound();
            group1.show();
            System.out.println("==================================");
            group2.oneRound();
            group2.show();
            System.out.println("==================================");
        }
        System.out.println("==================================");
        System.out.println("==================================");
    }
    private void oneRound(PeopleGroup group1,PeopleGroup group2){

    }

}
