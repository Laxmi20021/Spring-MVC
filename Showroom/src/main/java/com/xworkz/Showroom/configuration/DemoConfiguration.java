package com.xworkz.Showroom.configuration;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.Showroom")
@Configuration


public class DemoConfiguration {


    public DemoConfiguration()
    {
        System.out.println("No-args const of Demo Configurations");
    }
}
