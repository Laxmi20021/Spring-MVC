package com.xworkz.DeathCertified.service;

import com.xworkz.DeathCertified.dto.DeathcertifiedDTo;
import org.springframework.stereotype.Service;

@Service
public interface DeathCertifiedService {

    boolean validateAndSave(DeathcertifiedDTo deathcertifiedDTo);
}
