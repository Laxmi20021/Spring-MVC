package com.xworkz.Showroom.component;

import org.springframework.stereotype.Component;

@Component
public class Ola implements Ertiga{

    public Ola()
    {
        System.out.println("const of Ola");
    }


    @Override
    public void cost()
    {
        System.out.println("ola cost is....");
    }
}
