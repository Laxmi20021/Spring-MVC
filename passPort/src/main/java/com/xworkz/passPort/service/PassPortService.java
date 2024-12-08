package com.xworkz.passPort.service;

import com.xworkz.passPort.dto.PassPortDTO;
import org.springframework.stereotype.Service;

@Service
public interface PassPortService {

    boolean validateAndSave(PassPortDTO dto);
}
