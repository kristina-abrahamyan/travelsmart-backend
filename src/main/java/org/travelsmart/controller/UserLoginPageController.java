package org.travelsmart.controller;

import org.travelsmart.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.travelsmart.model.UserRegistration;
import org.travelsmart.repository.UserRepository;

import java.util.Map;

@RestController
@RequestMapping("/travelsmart")
@CrossOrigin
public class UserLoginPageController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public ResponseEntity login(@RequestBody UserRegistration loginRequest) {
        if (loginRequest != null
                && userRepository.findByEmailAndPassword(loginRequest.getEmail(), loginRequest.getPassword())
                    .isPresent()) {
                return ResponseEntity.ok(Map.of("message", "Login successful for user: " + loginRequest.getEmail()));
        } else if (loginRequest != null
                && userRepository.findByEmail(loginRequest.getEmail()).isPresent()) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(Map.of("message", "Incorrect password"));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "User is not registered"));
        }

    }

    @RequestMapping(value = "/signup", method = {RequestMethod.POST})
    public ResponseEntity signup (@RequestBody UserRegistration signupRequest) {
        if (signupRequest != null) {
            if (userRepository.findByEmail(signupRequest.getEmail()).isPresent()) {
                return  ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("message", "This email is already registered"));
            } else {
                UserInfo userInfo = new UserInfo();
                userInfo.setEmail(signupRequest.getEmail());
                userInfo.setPassword(signupRequest.getPassword());
                userRepository.save(userInfo);

                return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "Signup successful"));
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Some information is missing"));
        }
    }
}
