package com.example.mashupstudyuser.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping( value = "/signup")
    public void signup(@RequestBody ReqSignupDto reqSignupDto){
        userService.signUp(reqSignupDto);
        new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
    }
}
