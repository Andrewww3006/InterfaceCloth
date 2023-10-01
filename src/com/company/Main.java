package com.company;

import com.company.jackets.GucciJacket;
import com.company.jackets.NikeJacket;
import com.company.pants.GucciPants;
import com.company.pants.NikePants;
import com.company.shoes.GucciShoes;
import com.company.shoes.NikeShoes;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GucciJacket jacket1 = new GucciJacket();
        GucciPants pants1 = new GucciPants();
        GucciShoes shoes1 = new GucciShoes();
        NikeJacket jacket2 = new NikeJacket();
        NikePants pants2 = new NikePants();
        NikeShoes shoes2 = new NikeShoes();

        Person ben = new Person("Ben", jacket1,pants2, shoes2);
        Person alex = new Person("Alex",jacket2,pants1,shoes1);
        Person tom = new Person("Tom",jacket1,pants1,shoes2);

        ben.putOn();
        ben.takeOff();

        alex.putOn();
        alex.takeOff();

        tom.putOn();
        tom.takeOff();


    }
}
