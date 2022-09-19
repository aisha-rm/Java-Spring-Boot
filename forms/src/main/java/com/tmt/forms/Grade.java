package com.tmt.forms;

public class Grade {
    private String name;
    private String subject;
    private double score;


    public Grade() {
    }

    public Grade(String name, String subject, double score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}