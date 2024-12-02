package com.xworkz.sports.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ball {


    @Autowired
    private double ballcost;

    public Ball()
    {
        System.out.println("no- args constructor of ball");
    }


}
