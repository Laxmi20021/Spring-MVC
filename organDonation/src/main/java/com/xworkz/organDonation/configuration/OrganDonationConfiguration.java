package com.xworkz.organDonation.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.organDonation")
public class OrganDonationConfiguration {


    public OrganDonationConfiguration()
    {
        System.out.println("Running OrganDonationConfiguration");
    }
}
