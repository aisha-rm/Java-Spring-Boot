package com.tmt.operations_api;

public class Result {
    private String slackUsername;
    private String operation_type;
    private int result;


    public Result(String slackUsername, String operation_type, int result) {
        this.slackUsername = slackUsername;
        this.operation_type = operation_type;
        this.result = result;
    }

    public String getSlackUsername() {
        return this.slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public String getOperation_type() {
        return this.operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    
}
