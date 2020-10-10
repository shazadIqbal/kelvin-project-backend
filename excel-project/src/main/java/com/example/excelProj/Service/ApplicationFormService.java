package com.example.excelProj.Service;

import com.example.excelProj.Commons.ApiResponse;
import com.example.excelProj.Model.ApplicantForm;
import com.example.excelProj.Repository.ApplicantFormRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//import java.text.SimpleDateFormat;


@Service
public class ApplicationFormService {

 @Autowired
 private ApplicantFormRepository applicationFormRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    Logger logger = LoggerFactory.getLogger(ApplicationFormService.class);


    public ApplicantForm save(ApplicantForm applicantForm) {
        return applicationFormRepository.save(applicantForm);
    }

    public List<ApplicantForm> getAllApplicantForm(){
       List<ApplicantForm>  applicantForm=applicationFormRepository.findAll();
        return applicantForm;

    }


    public ApiResponse<ApplicantForm> update(Long id,ApplicantForm applicantForm){
        Optional<ApplicantForm> updatedRecord=applicationFormRepository.findById(id);
        if(updatedRecord.isPresent()){
            applicantForm.setId(id);
            return new ApiResponse<ApplicantForm>(200,"updated",applicationFormRepository.save(applicantForm));

        }
        return new ApiResponse<ApplicantForm>(404,"Record Not Found",null);
    }

    public ApiResponse<ApplicantForm> delete(Long id){
        Optional<ApplicantForm> applicantForm=applicationFormRepository.findById(id);
        if(applicantForm.isPresent()){
            applicationFormRepository.deleteById(id);
            return new ApiResponse<ApplicantForm>(200,"Deleted",null);
        }
        else{

            return new ApiResponse<ApplicantForm>(404,"Record not found",null);

        }



    }

    public ApiResponse<String> trigerEmail(Long id, String recevierEmail) {

        Optional<ApplicantForm> applicantForm=applicationFormRepository.findById(id);
        if(applicantForm.isPresent()){
            if(sendEmail(recevierEmail)){
                logger.info("Email send Successful");
                return new ApiResponse<>(200,"Email Send Successfully",null);
            }
            else{
                logger.info("Email failed");
                return new ApiResponse<>(404,"Applicant doesnot exsist","didnot Find the Applicant");
            }
        }
        return new ApiResponse<>(404,"Applicant doesnot exsist","didnot Find the Applicant");


    }

    boolean sendEmail(String recevierEmail) {
        try {
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setTo(recevierEmail);

            msg.setSubject("Testing from Spring Boot");
            msg.setText("Hello World \n Spring Boot Email");

            javaMailSender.send(msg);
            return true;
        }catch(Exception e){e.printStackTrace();
            return false;
        }

    }


    public ApiResponse<ApplicantForm> getPortfolio(Long id){
        Optional<ApplicantForm> applicantForm=applicationFormRepository.findById(id);
        if(applicantForm.isPresent()){
            return new ApiResponse<>(200,"Applicant found successfully",applicantForm.get());
        }
        return new ApiResponse<ApplicantForm>(404,"Applicant not Found",null);
    }

}
