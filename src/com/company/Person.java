package com.company;

import com.company.service.IJacket;
import com.company.service.IPants;
import com.company.service.IPerson;
import com.company.service.IShoes;

public class Person implements IPerson {

private IJacket  jacket;
private IPants pants;
private IShoes shoes;
private String name;

    public Person(String name, IJacket jacket, IPants pants, IShoes shoes)
    {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;

    }


    @Override
    public void putOn() {
        System.out.println(name + "Оделся, он");
        jacket.putOn();
        pants.putOn();
        shoes.putOn();

    }

    @Override
    public void takeOff() {
        System.out.println(name + "Разделся, он");
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
