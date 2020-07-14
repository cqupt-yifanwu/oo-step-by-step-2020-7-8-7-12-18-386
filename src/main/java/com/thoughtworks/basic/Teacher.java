package com.thoughtworks.basic;

public class Teacher extends Person {
    public String job;
    @Override
    public String introduce() {
        return "My name is Matt. I am 30 years old. I am a Teacher.";
    }
}
