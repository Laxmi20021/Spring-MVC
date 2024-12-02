package com.xworkz.Showroom.component;

import org.springframework.stereotype.Component;

@Component
public class Thar implements Ertiga{

    public Thar()
    {
        System.out.println("const of Thar");
    }

    @Override
    public void cost()
    {
        System.out.println("Thar cost is .....");
    }
}
