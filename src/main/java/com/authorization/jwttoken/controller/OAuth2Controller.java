package com.authorization.jwttoken.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/oauth2")
public class OAuth2Controller {

    @GetMapping("/hello")
    public ResponseEntity<String> showMessage(){
        return ResponseEntity.ok("Hello User!!1");
    }
}
