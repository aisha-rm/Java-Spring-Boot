package com.tmt.operations_api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class opController {

    private int result;

    @PostMapping("/")
    public Result saveResult(@RequestBody Operation operation){
        //get json received deserialised into operation java object and give logic for operation below
        
        String requestedOp = operation.getOperation_type().toUpperCase();   
        Op requested = Op.valueOf(requestedOp);     //convert json operation to enum
            //use converted enum in switch case
            switch (requested){
                case ADDITION:
                    result = operation.getX() + operation.getY();
                    break;
                case ADD:
                    result = operation.getX() + operation.getY();
                    break;
                case SUBTRACTION:
                    result = operation.getX() - operation.getY();
                    break;
                case SUBTRACT:
                    result = operation.getX() - operation.getY();
                    break;
                case MULTIPLICATION:
                    result = operation.getX() * operation.getY();
                    break;
                case MULTIPLY:
                    result = operation.getX() * operation.getY();
                    break;
            }

        //return new json as below
        return new Result("Shatu", operation.getOperation_type(), result);
    }
}


