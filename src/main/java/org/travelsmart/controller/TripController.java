package org.travelsmart.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trip")
public class TripController {


    @PostMapping(path={"/create"})
    public ResponseEntity <?> createTrip () {

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
