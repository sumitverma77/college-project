<<<<<<< HEAD
//package com.example.collegeproject.services;
//
//import com.example.collegeproject.dto.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class Authentication {
//    private  final User userrepo;
//    @Autowired
//    public user(User userrepo)
//    {
//        this.userrepo=userrepo;
//    }
//    public User save(User user) {
//        return userrepo.
//    }
//
//
=======
package com.example.collegeproject.services;

import com.example.collegeproject.dto.AuthenticationDetails;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class Authentication {
    static Map<String, String> userdetails = new HashMap<>();
    public static Boolean register(AuthenticationDetails request)
    {

        if(userdetails.containsKey(request.getUsername()))
        {
            return Boolean.FALSE;
        }
        userdetails.put(request.getUsername(), request.getPassword());
       return Boolean.TRUE;
    }
    public static boolean signin(String username, String password)
    {

        if (password.equals(userdetails.get(username))){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
>>>>>>> master
