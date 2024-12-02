package com.xworkz.Showroom.component;

import org.springframework.stereotype.Component;

@Component
public class NammaYatri implements Ertiga{

    public NammaYatri()
    {
        System.out.println("const of NammaYatri");
    }

    @Override
    public void cost()
    {
        System.out.println("NammaYatri cost is.....");
    }
}
