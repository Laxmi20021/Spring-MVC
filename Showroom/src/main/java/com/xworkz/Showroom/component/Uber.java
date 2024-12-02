package com.xworkz.Showroom.component;

import org.springframework.stereotype.Component;

@Component
public class Uber implements Ertiga{

    public Uber()
    {
        System.out.println("const of Uber");
    }

    @Override
    public void cost()
    {
        System.out.println("Uber cost is ....");
    }
}
