package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void should_get_string_when_run_introduce() {
        Person person = new Person();

        Assert.assertEquals("My name is Tom. I am 21 years old.", person.introduce());
    }
}
