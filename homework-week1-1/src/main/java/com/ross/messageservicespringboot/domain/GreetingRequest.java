package com.ross.messageservicespringboot.domain;

import lombok.Data;

@Data
public class GreetingRequest {
    private String userName;
    private String location;
    private String zip;
}
