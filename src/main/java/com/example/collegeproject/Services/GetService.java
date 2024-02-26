package com.example.collegeproject.services;

import com.example.collegeproject.dto.UserDetailsRequest;
import com.example.collegeproject.dto.responseDto.UserDetailsResponse;
import com.example.collegeproject.entity.JoinForm;
import com.example.collegeproject.repo.JoinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class GetService {
    @Autowired
  private   JoinRepo joinRepo;
    public  UserDetailsResponse get(UserDetailsRequest request)
    {

//        ye line ka mtlb puchhna
        UserDetailsResponse userDetailsResponse=new UserDetailsResponse();
        JoinForm joinForm= joinRepo.findFirstById(request.getId());

        if(joinForm!=null)
        {
            userDetailsResponse.setId(joinForm.getid());
            userDetailsResponse.setGmail(joinForm.getGmail());
            userDetailsResponse.setName(joinForm.getName());
            userDetailsResponse.setPhone(joinForm.getPhone());

        }
         userDetailsResponse.setId(request.getId());
        return userDetailsResponse;
    }
}

