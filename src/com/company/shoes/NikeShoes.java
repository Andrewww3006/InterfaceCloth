package com.company.shoes;

import com.company.service.IShoes;

public class NikeShoes implements IShoes {
    public NikeShoes(){};
    @Override
    public void putOn() {
        System.out.println("надел ботинки от Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("снял ботинки от Nike");
    }
}
