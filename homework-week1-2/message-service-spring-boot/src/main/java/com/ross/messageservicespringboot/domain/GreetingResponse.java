package com.ross.messageservicespringboot.domain;

import lombok.Data;

@Data
public class GreetingResponse {
    private String userName;
    private String message;
}
