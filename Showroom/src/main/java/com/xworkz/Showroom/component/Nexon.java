package com.xworkz.Showroom.component;

import org.springframework.stereotype.Component;

@Component
public class Nexon implements Ertiga{

    public Nexon()
    {
        System.out.println("const of Nexon");
    }


    @Override
    public void cost()
    {
        System.out.println("nexon cost is....");
    }
}
