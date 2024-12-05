package com.xworkz.Matrimony.component;

import com.xworkz.Matrimony.dto.MatrimonyDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class MatrimonyComponent {



    public MatrimonyComponent()
    {
        System.out.println("Running MatrimonyComponent");
    }




    @RequestMapping("/send")
    public String onApply(MatrimonyDTO matrimonyDTO)
    {
        System.out.println("Running onApply in MatrimonyComponent");
        System.out.println("Data from form:"+ matrimonyDTO);
        return "Matrimony.jsp";
    }



}
