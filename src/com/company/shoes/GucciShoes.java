package com.company.shoes;

import com.company.service.IShoes;

public class GucciShoes implements IShoes {
    public GucciShoes(){};
    @Override
    public void putOn() {
        System.out.println("надел ботинки от Gucci");
    }

    @Override
    public void takeOff() {
        System.out.println("снял ботинки от Gucci");
    }
}
