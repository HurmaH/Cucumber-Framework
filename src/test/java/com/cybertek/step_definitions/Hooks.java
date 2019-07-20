package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before(order =2)
    public void setUp() {
        System.out.println("I am setting up the test from the Hooks class!!!");
        Driver
    }

    @After
    public void tearDown() {
        System.out.println("Ia m reporting results!!!");
    }

    @Before (value="@wip", order =11)
    public void setUpTeacher() {
        System.out.println("I am setting up Teacher the test from the Hooks class!!!");
    }
}
