package com.xworkz.job.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.job")
public class JobConfiguration {



    public JobConfiguration()
    {
        System.out.println("Running JobConfiguration");
    }


}
