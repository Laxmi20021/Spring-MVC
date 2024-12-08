package com.xworkz.DeathCertified.service;

import com.xworkz.DeathCertified.dto.DeathcertifiedDTo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DeathCertifiedImpl implements DeathCertifiedService{

    public DeathCertifiedImpl()
    {
        System.out.println("running in DeathCertifiedImpl");

    }

    @Override
    public boolean validateAndSave(DeathcertifiedDTo deathcertifiedDTo)
    {
        return true;
    }


}
