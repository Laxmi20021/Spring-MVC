package com.xworkz.Showroom.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:persist.properties")
public class Cycle {

    @Qualifier("Rapido")
    private Ertiga ertiga;


    @Autowired
    private NammaYatri nammaYatri;

    @Value("${dbusername}")
    private String username;

    @Value("${password}")
    private String password;

    public Cycle()
    {
        System.out.println("const of Cycle");
    }

    @Override
    public String toString() {
        return "Cycle{}";
    }

    public Cycle(String username, String password)
    {
        this.username=username;
        this.password=password;
    }

    public void display()
    {
        System.out.println(this.username=username);
        System.out.println(this.password=password);
    }
}
