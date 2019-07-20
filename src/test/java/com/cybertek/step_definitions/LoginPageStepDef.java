package com.cybertek.step_definitions;

import cucumber.api.java.en.When;

public class LoginPageStepDef {

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String pass) {

        System.out.println("Email from feature file: "+email);
        System.out.println("Password from feature file: "+pass);
    }

    @When("the title should be {string}")
    public void the_title_should_be(String title) { //one argument , can rename parameter name
        System.out.println("Title: "+title);
    }

    @When("there should be {int} menu options")
    public void there_should_be_menu_options(Integer count) {

        System.out.println("count = "+count);
    }
}
