package com.ross.messageservicespringboot.rest;

import com.ross.messageservicespringboot.domain.GreetingRequest;
import com.ross.messageservicespringboot.domain.GreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageServiceRestController {

    @GetMapping(value = "/greet/{userName}")
    public String greet(@PathVariable String userName) {
        return "Greet " + userName;
    }

    @GetMapping(value = "/greet2/{userName}")
    public String greet2(@PathVariable String userName, @RequestParam String city) {
        return "Greet2 " + userName + " at " + city;
    }

    @PostMapping(value = "/messages")
    public GreetingResponse greetMessage(@RequestBody GreetingRequest request) {
        GreetingResponse response = new GreetingResponse();
        response.setUserName(request.getUserName());
        response.setMessage("Hello " + response.getUserName() + " at " + request.getLocation());
        return response;
    }
}
