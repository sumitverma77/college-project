package com.example.collegeproject.services;

import com.example.collegeproject.dto.JoinRequest;
import com.example.collegeproject.dto.responcedto.RegistrationResponse;
import com.example.collegeproject.entity.JoinForm;
import com.example.collegeproject.repo.JoinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
@Autowired
private  JoinRepo joinRepo ;

    /**
     * creates entry for joinform if not present
     * @param request
     * @return boolean
     */
    public RegistrationResponse join (JoinRequest request)
{
    JoinForm existingUser=joinRepo.findFirstById(request.getid());
    RegistrationResponse registrationResponse=new RegistrationResponse();
    if(existingUser!=null)
    {
        registrationResponse.setUserId(request.getid());
        registrationResponse.setMessage("already submitted");
    }
    else {
        JoinForm joinform = new JoinForm();
        joinform.setid(request.getid());
        joinform.setPhone(request.getPhone());
        joinform.setGmail(request.getGmail());
        joinform.setName(request.getName());
        joinRepo.save(joinform);
        // todo : builder package me le jao
        registrationResponse.setMessage("submitted succesfully");
        registrationResponse.setUserId(request.getid());
    }
//
        return registrationResponse;





}
}
