package com.example.excelProj.Model;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

/**
 * A ApplicantForm.
 */
@Entity
@Table(name = "applicant_form")
public class ApplicantForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "user_image")
    private byte[] userImage;

    @Column(name = "user_image_content_type")
    private String userImageContentType;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "recevier_email")
    private String recevierEmail;

    @Column(name = "home_number")
    private String homeNumber;

    @Column(name = "cell_number")
    private String cellNumber;

    @Column(name = "address")
    private String address;


    @Column(name = "gender")
    private String gender;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "date_of_birth")
    private Instant dateOfBirth;

    @Column(name = "visa_details")
    private String visaDetails;

    @Column(name = "citizenship")
    private String citizenship;

    @Lob
    @Column(name = "resume")
    private byte[] resume;

    @Column(name = "resume_content_type")
    private String resumeContentType;

    @Lob
    @Column(name = "employee_application")
    private byte[] employeeApplication;

    @Column(name = "employee_orientation")
    private Boolean employeeOrientation;

    @Lob
    @Column(name = "employee_identification")
    private byte[] employeeIdentification;

    @Lob
    @Column(name = "security_clearance")
    private byte[] securityClearance;

    @Column(name = "medical_clearance")
    private Boolean medicalClearance;

    @Column(name = "employee_wellness")
    private Boolean employeeWellness;

    @Column(name = "emergency_contact")
    private Boolean emergencyContact;

    @Column(name= "visa_work_options")
    private String visaWorkOptions;

    @Lob
    @Column(name= "social_media_links")
    private String socialMediaLinks;

    @Column(name = "kpi_certified")
    private Boolean kpiCertified;

    @Column(name = "emergency_name")
    private String emergencyName;

    @Column(name = "emergency_phone")
    private String emergencyPhone;

    @Column(name = "emergency_address")
    private String emergencyAddress;

    @Column(name = "profile_id")
    private String profileId;


    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "province")
    private String province;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "zip_code_for_emergency")
    private String zipCodeForEmergency;

    @Column(name = "province_for_emergency")
    private String provinceForEmergency;

    @Column(name = "city_for_emergency")
    private String cityForEmergency;

    @Column(name = "country_for_emergency")
    private String countryForEmergency;

    @Column(name = "canadian_citizenship_details")
    private String canadianCitizenshipDetails;

    @Column(name = "visa_expiry_date")
    private String visaExpiryDate;

    @Column(name = "wage")
    private String wage;

    @Column(name = "position")
    private String position;


    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getUserImage() {
        return userImage;
    }

    public ApplicantForm userImage(byte[] userImage) {
        this.userImage = userImage;
        return this;
    }

    public ApplicantForm kpiCertified(Boolean kpiCertified) {
        this.kpiCertified = kpiCertified;
        return this;
    }

    public Boolean getKpiCertified() {
        return kpiCertified;
    }

    public void setKpiCertified(Boolean kpiCertified) {
        this.kpiCertified = kpiCertified;
    }

    public void setUserImage(byte[] userImage) {
        this.userImage = userImage;
    }

    public String getUserImageContentType() {
        return userImageContentType;
    }

    public ApplicantForm userImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
        return this;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    public String getName() {
        return name;
    }

    public ApplicantForm name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public ApplicantForm email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRecevierEmail() {
        return recevierEmail;
    }

    public ApplicantForm recevierEmail(String recevierEmail) {
        this.recevierEmail = recevierEmail;
        return this;
    }

    public void setRecevierEmail(String recevierEmail) {
        this.recevierEmail = recevierEmail;
    }



    public ApplicantForm homeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
        return this;
    }

    public ApplicantForm cellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
        return this;
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

    public String getAddress() {
        return address;
    }

    public ApplicantForm address(String address) {
        this.address = address;
        return this;
    }

    public ApplicantForm socialMediaLinks(String socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
        return this;
    }

    public String getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public void setSocialMediaLinks(String socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public ApplicantForm gender(String gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public ApplicantForm placeOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public ApplicantForm dateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public void setDateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getVisaDetails() {
        return visaDetails;
    }

    public ApplicantForm visaDetails(String visaDetails) {
        this.visaDetails = visaDetails;
        return this;
    }

    public void setVisaDetails(String visaDetails) {
        this.visaDetails = visaDetails;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public ApplicantForm citizenship(String citizenship) {
        this.citizenship = citizenship;
        return this;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public byte[] getResume() {
        return resume;
    }

    public ApplicantForm resume(byte[] resume) {
        this.resume = resume;
        return this;
    }

    public void setResume(byte[] resume) {
        this.resume = resume;
    }

    public String getResumeContentType() {
        return resumeContentType;
    }

    public ApplicantForm resumeContentType(String resumeContentType) {
        this.resumeContentType = resumeContentType;
        return this;
    }

    public void setResumeContentType(String resumeContentType) {
        this.resumeContentType = resumeContentType;
    }


    public Boolean isEmployeeOrientation() {
        return employeeOrientation;
    }

    public ApplicantForm employeeOrientation(Boolean employeeOrientation) {
        this.employeeOrientation = employeeOrientation;
        return this;
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





    public Boolean isMedicalClearance() {
        return medicalClearance;
    }

    public ApplicantForm medicalClearance(Boolean medicalClearance) {
        this.medicalClearance = medicalClearance;
        return this;
    }

    public void setMedicalClearance(Boolean medicalClearance) {
        this.medicalClearance = medicalClearance;
    }

    public Boolean isEmployeeWellness() {
        return employeeWellness;
    }

    public ApplicantForm employeeWellness(Boolean employeeWellness) {
        this.employeeWellness = employeeWellness;
        return this;
    }

    public void setEmployeeWellness(Boolean employeeWellness) {
        this.employeeWellness = employeeWellness;
    }

    public Boolean isEmergencyContact() {
        return emergencyContact;
    }

    public ApplicantForm emergencyContact(Boolean emergencyContact) {
        this.emergencyContact = emergencyContact;
        return this;
    }

    public void setEmergencyContact(Boolean emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove


    public ApplicantForm visaWorkOptions(String visaWorkOptions) {
        this.visaWorkOptions = visaWorkOptions;
        return this;
    }

    public String getVisaWorkOptions() {
        return visaWorkOptions;
    }

    public void setVisaWorkOptions(String visaWorkOptions) {
        this.visaWorkOptions = visaWorkOptions;
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

    public String getProfileId() {
        return profileId;
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

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getCanadianCitizenshipDetails() {
        return canadianCitizenshipDetails;
    }

    public void setCanadianCitizenshipDetails(String canadianCitizenshipDetails) {
        this.canadianCitizenshipDetails = canadianCitizenshipDetails;
    }

    public byte[] getEmployeeApplication() {
        return employeeApplication;
    }

    public void setEmployeeApplication(byte[] employeeApplication) {
        this.employeeApplication = employeeApplication;
    }

    public byte[] getSecurityClearance() {
        return securityClearance;
    }

    public void setSecurityClearance(byte[] securityClearance) {
        this.securityClearance = securityClearance;
    }

    public String getVisaExpiryDate() {
        return visaExpiryDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicantForm)) {
            return false;
        }
        return id != null && id.equals(((ApplicantForm) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "ApplicantForm{" +
            "id=" + getId() +
            ", userImage='" + getUserImage() + "'" +
            ", userImageContentType='" + getUserImageContentType() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", recevierEmail='" + getRecevierEmail() + "'" +
            ", phone='" + getHomeNumber() + "'" +
            ", address='" + getAddress() + "'" +
            ", gender='" + getGender() + "'" +
            ", placeOfBirth='" + getPlaceOfBirth() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            ", visaDetails='" + getVisaDetails() + "'" +
            ", citizenship='" + getCitizenship() + "'" +
            ", resume='" + getResume() + "'" +
            ", resumeContentType='" + getResumeContentType() + "'" +
//            ", employeeApplication='" + isEmployeeApplication() + "'" +
            ", employeeOrientation='" + isEmployeeOrientation() + "'" +

//            ", securityClearance='" + isSecurityClearance() + "'" +
            ", medicalClearance='" + isMedicalClearance() + "'" +
            ", employeeWellness='" + isEmployeeWellness() + "'" +
            ", emergencyContact='" + isEmergencyContact() + "'" +
            "}";
    }
}
