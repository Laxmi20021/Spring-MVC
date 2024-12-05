package com.xworkz.Matrimony.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.Matrimony")
public class MatrimonyConfiguration {


    public MatrimonyConfiguration()
    {
        System.out.println("Running MatrimonyConfiguration");
    }
}
