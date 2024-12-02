package com.xworkz.Showroom.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Rapido implements Ertiga{

    public Rapido()
    {
        System.out.println("const of Rapido");
    }


    @PostConstruct
    @Override
    public void cost()
    {
        System.out.println("rapido cost is ....");
    }
}
