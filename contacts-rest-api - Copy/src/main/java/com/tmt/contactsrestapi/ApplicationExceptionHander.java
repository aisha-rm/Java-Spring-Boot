package com.tmt.contactsrestapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.tmt.contactsrestapi.exception.ContactNotFoundException;
import com.tmt.contactsrestapi.exception.ErrorResponse;

@ControllerAdvice //makes class serve as global exception hnadler
public class ApplicationExceptionHander {

    @ExceptionHandler(ContactNotFoundException.class)   //above defines the exception the method below should handle
    public ResponseEntity<Object> handleContactNotFoundException(ContactNotFoundException ex) {
        //the thrown exception can be accessed from the arguments
        //the return type is comon practice as Object alows us to pass anything into ResponseEntity

        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage());   //SB serialises the error object into JSON
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    
}
