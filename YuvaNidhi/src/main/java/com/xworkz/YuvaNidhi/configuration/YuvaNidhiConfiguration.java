package com.xworkz.YuvaNidhi.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.YuvaNidhi")
public class YuvaNidhiConfiguration {



        public YuvaNidhiConfiguration()
        {
            System.out.println("Running YuvaNidhiConfiguration");
        }
}
