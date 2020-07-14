package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void get_introduce_string_when_run_introduce() {
        Student student = new Student();
        Assert.assertEquals("My name is Tom. I am 21 years old. I am a Student of Class 2.", student.introduce());
    }
}
