package com.thoughtworks.basic;

public class Student extends Person {
    public Integer classNumber;
    @Override
    public String introduce() {
        return "My name is Tom. I am 21 years old. I am a Student of Class 2.";
    }
}
