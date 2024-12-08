package com.xworkz.passPort.controller;

import com.xworkz.passPort.dto.PassPortDTO;
import com.xworkz.passPort.service.PassPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassPortController {

    @Autowired
    private PassPortService service;

    PassPortController(){
        System.out.println("created PassportController");
    }

    @RequestMapping("/passport")
    public String onSave(PassPortDTO dto){
        System.out.println("Passport Dto:"+dto);
        boolean saved=service.validateAndSave(dto);
        if(saved){
            System.out.println("data is saved");
        }
        else {
            System.out.println("data is not saved");
        }
        return "PassPort.jsp";
    }
}
