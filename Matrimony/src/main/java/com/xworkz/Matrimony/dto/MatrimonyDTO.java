package com.xworkz.Matrimony.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class MatrimonyDTO {


    private String Name;
    private String email;
    private long mobile;
    private int age;
    private String motherName;
    private String fatherName;
    private String gender;
    private String location;
    private String education;
    private String height;
    private String occupation;
}
