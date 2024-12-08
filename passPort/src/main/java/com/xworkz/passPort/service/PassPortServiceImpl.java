package com.xworkz.passPort.service;

import com.xworkz.passPort.dto.PassPortDTO;
import org.springframework.stereotype.Service;

@Service
public class PassPortServiceImpl implements PassPortService{

    PassPortServiceImpl(){
        System.out.println("created PassportServiceImpl");
    }
    @Override
    public boolean validateAndSave(PassPortDTO dto) {

        System.out.println("validating and saving passport dto:"+dto);
        return true;
    }
}
