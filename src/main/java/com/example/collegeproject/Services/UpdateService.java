package com.example.collegeproject.services;

import com.example.collegeproject.dto.UpdateRequest;
import com.example.collegeproject.dto.responseDto.RegistrationResponse;
import com.example.collegeproject.entity.JoinForm;
import com.example.collegeproject.repo.JoinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
    @Autowired
   private JoinRepo joinRepo;
    public RegistrationResponse update(UpdateRequest updateRequest) {
   JoinForm existingUser= joinRepo.findFirstById(updateRequest.getid());
   RegistrationResponse registrationResponse=new RegistrationResponse();
   if(existingUser!=null)
   {
       JoinForm joinForm=new JoinForm();
       joinForm.setid(updateRequest.getid());
       joinForm.setGmail(updateRequest.getGmail());
       joinForm.setName(updateRequest.getName());
       joinForm.setPhone(updateRequest.getPhone());
       joinRepo.save(joinForm);
       registrationResponse.setUserId(updateRequest.getid());
       registrationResponse.setMessage(" details updated successfully ");
   }
   else {
     registrationResponse.setUserId(updateRequest.getid());
       registrationResponse.setMessage("this username is not present");
   }
   return registrationResponse;
    }
}
