package com.tmt.contactsrestapi.exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorResponse {
    // send the user an error response
    private String message;

    //return timestamp of error but poor format if below codde not added
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    //shape defines the xture to use when serializing, can be NUMBER or BOOLEAN too
    //pattern defines the pattern to use
    private LocalDateTime timestamp;


    public ErrorResponse(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

}
