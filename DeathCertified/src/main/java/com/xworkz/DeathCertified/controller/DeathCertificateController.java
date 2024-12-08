package com.xworkz.DeathCertified.controller;

import com.xworkz.DeathCertified.dto.DeathcertifiedDTo;
import com.xworkz.DeathCertified.service.DeathCertifiedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class DeathCertificateController {


    @Autowired
    private DeathCertifiedService deathCertifiedService;
    public DeathCertificateController()
    {
        System.out.println("Running DeathCertificateController");
    }

    @RequestMapping("/deceased")
    public String save(DeathcertifiedDTo deathcertifiedDTo)
    {
        System.out.println("this is saved");
        System.out.println("DeathCertifiedService :" + deathcertifiedDTo);
        boolean ref=this.deathCertifiedService.validateAndSave(deathcertifiedDTo);

        if(ref)
        {
            System.out.println("this is saved");
        }

        else
        {
            System.out.println("this is not saved");
        }
        return "DeathCertified.jsp";
    }





}
