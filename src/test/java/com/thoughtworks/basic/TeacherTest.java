package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void get_introduceString_when_run_introduce() {
        Teacher teacher = new Teacher();
        Assert.assertEquals("My name is Matt. I am 30 years old. I am a Teacher.", teacher.introduce());
    }
}

