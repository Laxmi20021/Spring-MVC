package com.xworkz.goodluck.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.goodluck")
public class GoodluckConfiguration {

    public GoodluckConfiguration()
    {
        System.out.println("Running GoodluckConfiguration");
    }
}
