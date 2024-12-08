package com.xworkz.bankAccount.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BankAccountDTO {


    private String accountHolderName;
    private String accountNumber;
    private String IFSCcode;
    private String bankBranch;

}
