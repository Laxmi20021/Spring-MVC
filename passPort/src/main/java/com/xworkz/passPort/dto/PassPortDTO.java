package com.xworkz.passPort.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class PassPortDTO {


    private String registerAt; //
    private String passportOffice;
    private String givenName;
    private String surname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    private String email;
    private boolean loginIdChoice;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;
}
