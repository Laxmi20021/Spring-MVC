package com.xworkz.Showroom.component;

import org.springframework.stereotype.Component;

@Component
public class MgHector implements Ertiga{

    public MgHector()
    {
        System.out.println("const of MgHector");
    }

    @Override
    public void cost()
    {
        System.out.println("Mghector cost is....");
    }

}
