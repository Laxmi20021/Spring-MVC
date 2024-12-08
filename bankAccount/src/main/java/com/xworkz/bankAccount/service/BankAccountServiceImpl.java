package com.xworkz.bankAccount.service;

import com.xworkz.bankAccount.dto.BankAccountDTO;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{

    BankAccountServiceImpl()
    {
        System.out.println("Running in BankAccountServiceImpl");
    }


    @Override
    public boolean validateAndSave(BankAccountDTO bankAccountDTO)
    {
        System.out.println("Running validateAndSave in BankAccountServiceImpl");
        return true;
    }
}
