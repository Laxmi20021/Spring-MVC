package com.xworkz.bankAccount.service;

import com.xworkz.bankAccount.dto.BankAccountDTO;
import org.springframework.stereotype.Service;

@Service
public interface BankAccountService {

    boolean validateAndSave(BankAccountDTO bankAccountDTO);
}
