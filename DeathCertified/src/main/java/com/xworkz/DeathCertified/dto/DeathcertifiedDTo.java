package com.xworkz.DeathCertified.dto;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@AllArgsConstructor
@Setter
@ToString
@Getter
@Data
public class DeathcertifiedDTo {


        private  String deceasedName;
        private  Integer deceasedAge;
        private  String deceasedAddress;
        @DateTimeFormat(pattern = "DD-MM-YYYY")
        private  String deceaseddob;
        @DateTimeFormat(pattern = "DD-MM-YYYY")
        private  String deceasedLastDate;
        private  String deceasedCause;

}
