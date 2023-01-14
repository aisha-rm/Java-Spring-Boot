package com.tmt.operations_api;

public class Operation {
    private String operation_type;
    private int x;
    private int y;
    

    public Operation() {
    }

    public Operation(String operation_type, int x, int y) {
        this.operation_type = operation_type;
        this.x = x;
        this.y = y;
    }

    public String getOperation_type() {
        return this.operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}