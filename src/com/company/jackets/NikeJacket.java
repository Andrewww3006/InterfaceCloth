package com.company.jackets;

import com.company.service.IJacket;

public class NikeJacket implements IJacket {

    public NikeJacket(){};

    @Override
    public void putOn() {
        System.out.println("надел куртку от Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("снял куртку от Nike");
    }
}
