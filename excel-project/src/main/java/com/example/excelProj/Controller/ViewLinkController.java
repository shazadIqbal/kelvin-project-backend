package com.example.excelProj.Controller;

import com.example.excelProj.Commons.ApiResponse;
import com.example.excelProj.Dto.ViewLinkDto;
import com.example.excelProj.Service.ViewLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/viewlink")
public class ViewLinkController {

    @Autowired
    ViewLinkService viewLinkService;

    @PostMapping("/{id}")
    public ApiResponse saveTokenForLink(@RequestBody ViewLinkDto viewLinkDto,@PathVariable("id") Long id){
        return viewLinkService.saveTokenForLink(viewLinkDto,id);
    }

    @GetMapping("/{token}")
    public ApiResponse checkTokenExpiry(@PathVariable("token") String token){
        return viewLinkService.getByTokenIfNotVisited(token);
    }

    @GetMapping("/changetoyes/{token}")
    public  ApiResponse changeTokenVisitedToYes(@PathVariable("token") String token){
        return viewLinkService.setVisitedToYes(token);
    }
}
