package com.xworkz.bankAccount.controller;

import com.xworkz.bankAccount.dto.BankAccountDTO;
import com.xworkz.bankAccount.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    public BankAccountController()
    {
        System.out.println("Running in BankAccountController");
    }

    @RequestMapping("/bank")
    public String save(BankAccountDTO bankAccountDTO)
    {
        System.out.println("Running in save");
        System.out.println("BankAccountDTO:"+bankAccountDTO);
        boolean ref=this.bankAccountService.validateAndSave(bankAccountDTO);
        if(ref)
        {
            System.out.println("Successfully saved");
        }
        else {
            System.out.println("Failure");
        }

        return "BankAccount.jsp";
    }
}
