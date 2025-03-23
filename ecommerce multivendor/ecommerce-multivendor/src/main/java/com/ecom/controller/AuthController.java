package com.ecom.controller;

import com.ecom.model.User;
import com.ecom.repository.UserRepository;
import com.ecom.response.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    private final UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<User>  createUserHandler(@RequestBody SignupRequest req){
        User user = new User();
        user.setEmail(req.getEmail());
        user.setFullName(req.getFullName());

        User saveuser =userRepository.save(user);
        return ResponseEntity.ok(saveuser);
    }
}
