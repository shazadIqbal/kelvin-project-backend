package com.example.excelProj.Service;

import com.example.excelProj.Commons.ApiResponse;
import com.example.excelProj.Dto.ViewLinkDto;
import com.example.excelProj.Model.ViewLink;
import com.example.excelProj.Repository.ViewLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ViewLinkService {

    @Autowired
    ViewLinkRepository viewLinkRepository;

    @Autowired
    JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String username;

    public ApiResponse saveTokenForLink(ViewLinkDto viewLinkDto,Long id){
        String token = generateUUID();
        ViewLink viewLink = new ViewLink(viewLinkDto.getEmail(),token,"no");
        try {
            mailToUser(viewLinkDto.getEmail(),token,id);
            return new ApiResponse(200,"Mail sent",viewLinkRepository.save(viewLink));
        }
        catch (Exception e){
            return new ApiResponse(404,"Token not saved",null);
        }
    }

    public ApiResponse getByTokenIfNotVisited(String token){
        ViewLink viewLink = viewLinkRepository.findByToken(token);
        if(viewLink != null){
            return new ApiResponse(200,"record found against token",viewLink);
        }else{
            return new ApiResponse(400,"record not found against user",null);
        }
    }

    public ApiResponse setVisitedToYes(String token){
        ViewLink viewLink = viewLinkRepository.findByToken(token);
        if(viewLink != null){
            viewLink.setVisited("yes");
            try {
                return new ApiResponse(200,"Token saved",viewLinkRepository.save(viewLink));
            }
            catch (Exception e){
                return new ApiResponse(404,"Token not saved",null);
            }
        }
        else{
            return new ApiResponse(404,"Record not found",null);
        }
    }

    void mailToUser(String recevierEmail, String token,Long id) {

        try {
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setTo(recevierEmail);
            msg.setFrom(username);

            msg.setSubject("Visit this link to see your profile");
            msg.setText("link to your profile is : https://workboard.ca/gigsterprofiles/#/viewportfolio/emaillink/"+id+"/" + token);

            javaMailSender.send(msg);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }


    public String generateUUID() {
        return   UUID.randomUUID().toString();
    }
}
