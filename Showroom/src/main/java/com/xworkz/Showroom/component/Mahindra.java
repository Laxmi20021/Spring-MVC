package com.xworkz.Showroom.component;

import org.springframework.stereotype.Component;

@Component
public class Mahindra implements Ertiga{


    public Mahindra()
    {
        System.out.println("const of Mahindra");
    }

    @Override
    public void cost()
    {
        System.out.println("mahindra cost is");
    }
}
