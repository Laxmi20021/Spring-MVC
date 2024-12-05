package com.xworkz.organDonation.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class OrganDonationDTO {

    private String firstName;
    private String lastName;
    private String email;
    private long mobile;
    private String location;
    private int age;
    private String hospitalName;
    private String booldType;
    private String medicalHistory;
    private int doctorId;


}
