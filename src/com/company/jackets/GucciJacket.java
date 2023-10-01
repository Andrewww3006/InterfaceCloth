package com.company.jackets;

import com.company.service.IJacket;

public class GucciJacket implements IJacket {

public GucciJacket(){};

    @Override
    public void putOn() {
        System.out.println("надел куртку от Gucci");
    }

    @Override
    public void takeOff() {
        System.out.println("снял куртку от Gucci");
    }


}
