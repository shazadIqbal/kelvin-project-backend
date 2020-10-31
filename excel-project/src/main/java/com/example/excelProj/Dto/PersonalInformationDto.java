package com.example.excelProj.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Lob;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalInformationDto {
    String name;
    String email;
    String homeNumber;
    String cellNumber;
    String gender;
    String cityForPlaceOfBirth;
    String countryForPlaceOfBirth;
    String provinceForPlaceOfBirth;
    Instant dateOfBirth;
    Boolean kpiCertified;
    String profileNumber;

    String emergencyEmail;

    private byte[] userImage;

    private String userImageContentType;

    private String recevierEmail;

    private String address;

    private String visaDetails;

    private String citizenship;

    private byte[] resume;

    private String resumeContentType;

    private byte[] employeeApplication;

    private Boolean employeeOrientation;

    private byte[] employeeIdentification;

    private byte[] securityClearance;

    private Boolean medicalClearance;

    private Boolean employeeWellness;

    private Boolean emergencyContact;

    private String visaWorkOptions;

    private String socialMediaLinks;


    private String emergencyName;

    private String emergencyPhone;

    private String emergencyAddress;

    private String zipCode;

    private String province;

    private String city;

    private String country;

    private String zipCodeForEmergency;

    private String provinceForEmergency;

    private String cityForEmergency;

    private String countryForEmergency;

    private String canadianCitizenshipDetails;

    private String visaExpiryDate;

    private String wage;

    private String position;

    private Boolean draft;

    private String provinceForCompany;

    private String cityForCompany;

    private String countryForCompany;

    private String companyName;

    Double latitude;
    Double longitude;
}
