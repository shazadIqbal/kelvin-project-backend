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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCityForPlaceOfBirth() {
        return cityForPlaceOfBirth;
    }

    public void setCityForPlaceOfBirth(String cityForPlaceOfBirth) {
        this.cityForPlaceOfBirth = cityForPlaceOfBirth;
    }

    public String getCountryForPlaceOfBirth() {
        return countryForPlaceOfBirth;
    }

    public void setCountryForPlaceOfBirth(String countryForPlaceOfBirth) {
        this.countryForPlaceOfBirth = countryForPlaceOfBirth;
    }

    public String getProvinceForPlaceOfBirth() {
        return provinceForPlaceOfBirth;
    }

    public void setProvinceForPlaceOfBirth(String provinceForPlaceOfBirth) {
        this.provinceForPlaceOfBirth = provinceForPlaceOfBirth;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getKpiCertified() {
        return kpiCertified;
    }

    public void setKpiCertified(Boolean kpiCertified) {
        this.kpiCertified = kpiCertified;
    }

    public String getProfileNumber() {
        return profileNumber;
    }

    public void setProfileNumber(String profileNumber) {
        this.profileNumber = profileNumber;
    }

    public String getEmergencyEmail() {
        return emergencyEmail;
    }

    public void setEmergencyEmail(String emergencyEmail) {
        this.emergencyEmail = emergencyEmail;
    }

    public byte[] getUserImage() {
        return userImage;
    }

    public void setUserImage(byte[] userImage) {
        this.userImage = userImage;
    }

    public String getUserImageContentType() {
        return userImageContentType;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    public String getRecevierEmail() {
        return recevierEmail;
    }

    public void setRecevierEmail(String recevierEmail) {
        this.recevierEmail = recevierEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVisaDetails() {
        return visaDetails;
    }

    public void setVisaDetails(String visaDetails) {
        this.visaDetails = visaDetails;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public byte[] getResume() {
        return resume;
    }

    public void setResume(byte[] resume) {
        this.resume = resume;
    }

    public String getResumeContentType() {
        return resumeContentType;
    }

    public void setResumeContentType(String resumeContentType) {
        this.resumeContentType = resumeContentType;
    }

    public byte[] getEmployeeApplication() {
        return employeeApplication;
    }

    public void setEmployeeApplication(byte[] employeeApplication) {
        this.employeeApplication = employeeApplication;
    }

    public Boolean getEmployeeOrientation() {
        return employeeOrientation;
    }

    public void setEmployeeOrientation(Boolean employeeOrientation) {
        this.employeeOrientation = employeeOrientation;
    }

    public byte[] getEmployeeIdentification() {
        return employeeIdentification;
    }

    public void setEmployeeIdentification(byte[] employeeIdentification) {
        this.employeeIdentification = employeeIdentification;
    }

    public byte[] getSecurityClearance() {
        return securityClearance;
    }

    public void setSecurityClearance(byte[] securityClearance) {
        this.securityClearance = securityClearance;
    }

    public Boolean getMedicalClearance() {
        return medicalClearance;
    }

    public void setMedicalClearance(Boolean medicalClearance) {
        this.medicalClearance = medicalClearance;
    }

    public Boolean getEmployeeWellness() {
        return employeeWellness;
    }

    public void setEmployeeWellness(Boolean employeeWellness) {
        this.employeeWellness = employeeWellness;
    }

    public Boolean getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(Boolean emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getVisaWorkOptions() {
        return visaWorkOptions;
    }

    public void setVisaWorkOptions(String visaWorkOptions) {
        this.visaWorkOptions = visaWorkOptions;
    }

    public String getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public void setSocialMediaLinks(String socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getEmergencyAddress() {
        return emergencyAddress;
    }

    public void setEmergencyAddress(String emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCodeForEmergency() {
        return zipCodeForEmergency;
    }

    public void setZipCodeForEmergency(String zipCodeForEmergency) {
        this.zipCodeForEmergency = zipCodeForEmergency;
    }

    public String getProvinceForEmergency() {
        return provinceForEmergency;
    }

    public void setProvinceForEmergency(String provinceForEmergency) {
        this.provinceForEmergency = provinceForEmergency;
    }

    public String getCityForEmergency() {
        return cityForEmergency;
    }

    public void setCityForEmergency(String cityForEmergency) {
        this.cityForEmergency = cityForEmergency;
    }

    public String getCountryForEmergency() {
        return countryForEmergency;
    }

    public void setCountryForEmergency(String countryForEmergency) {
        this.countryForEmergency = countryForEmergency;
    }

    public String getCanadianCitizenshipDetails() {
        return canadianCitizenshipDetails;
    }

    public void setCanadianCitizenshipDetails(String canadianCitizenshipDetails) {
        this.canadianCitizenshipDetails = canadianCitizenshipDetails;
    }

    public String getVisaExpiryDate() {
        return visaExpiryDate;
    }

    public void setVisaExpiryDate(String visaExpiryDate) {
        this.visaExpiryDate = visaExpiryDate;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public String getProvinceForCompany() {
        return provinceForCompany;
    }

    public void setProvinceForCompany(String provinceForCompany) {
        this.provinceForCompany = provinceForCompany;
    }

    public String getCityForCompany() {
        return cityForCompany;
    }

    public void setCityForCompany(String cityForCompany) {
        this.cityForCompany = cityForCompany;
    }

    public String getCountryForCompany() {
        return countryForCompany;
    }

    public void setCountryForCompany(String countryForCompany) {
        this.countryForCompany = countryForCompany;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
