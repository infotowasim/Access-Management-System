package com.happiestminds.response;

import lombok.Data;

@Data
public class Payload {

    private int code;
    private String message;
    private int applicationErrorCode;

}
