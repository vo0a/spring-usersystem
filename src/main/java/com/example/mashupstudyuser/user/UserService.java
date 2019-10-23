package com.example.mashupstudyuser.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void signUp(ReqSignupDto reqSignupDto){
        User user = new User(reqSignupDto.getUserId(), reqSignupDto.getPassword(), reqSignupDto.getName());
        userRepository.save(user);
    }
}
