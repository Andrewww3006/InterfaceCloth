package com.company.pants;

import com.company.service.IPants;

public class GucciPants implements IPants {
    public GucciPants(){};
    @Override
    public void putOn() {
        System.out.println("надел штаны от Gucci");
    }

    @Override
    public void takeOff() {
        System.out.println("снял шатны от Gucci");
    }
}
