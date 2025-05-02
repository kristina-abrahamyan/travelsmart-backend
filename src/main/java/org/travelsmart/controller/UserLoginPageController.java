package org.travelsmart.controller;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.travelsmart.model.UserRegistration;

import java.util.Map;

@RestController
@RequestMapping("/travelsmart")
@CrossOrigin
public class UserLoginPageController {
    @RequestMapping(value = "/login", method = {RequestMethod.POST})

    public ResponseEntity login(@RequestBody UserRegistration loginRequest) {
        if (loginRequest != null) {
            return ResponseEntity.ok(Map.of("message", "Login successful for user: " + loginRequest.getEmail()));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "User is not registered"));
        }

    }
}
