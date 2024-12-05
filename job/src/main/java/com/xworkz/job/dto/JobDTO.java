package com.xworkz.job.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class JobDTO {


    private String firstName;
    private String lastName;
    private String email;
    private long mobile;
    private String passoutyear;
    private String location;
    private int age;
    private String companyName;
    private String education;
    private String position;

}
