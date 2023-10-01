package com.company.pants;

import com.company.service.IPants;

public class NikePants implements IPants {
public NikePants(){};
    @Override
    public void putOn() {
        System.out.println("надел штаны от Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("снял шатны от Nike");
    }

}
