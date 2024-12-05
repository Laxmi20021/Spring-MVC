package com.xworkz.organDonation.component;

import com.xworkz.organDonation.dto.OrganDonationDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class OrganDonationComponent {



    public OrganDonationComponent()
    {
        System.out.println("Running OrganDonationComponent");
    }




    @RequestMapping("/apply")
    public String onApply(OrganDonationDTO organDonationDTO)
    {
        System.out.println("Running onApply in OrganDonationComponent");
        System.out.println("Data from form:"+ organDonationDTO);
        return "OrganDonation.jsp";
    }


}
