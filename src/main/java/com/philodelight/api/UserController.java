package com.philodelight.api;

import com.philodelight.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @RequestMapping("/users")
    public User getUser(){
        User user = new User();
        user.setFirstName("Mr.Frosty");
        user.setLastName("Flakes");
        return user;
    }
    

}
