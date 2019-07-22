package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageStepDef {

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String pass) {

        System.out.println("Email from feature file: "+email);
        System.out.println("Password from feature file: "+pass);

        SignInPage signInPage = new SignInPage();
        signInPage.login(email,pass);

    }

    @When("the title should be {string}")
    public void the_title_should_be(String title) { //one argument , can rename parameter name
        System.out.println("Title: "+title);
    }

    @When("there should be {int} menu options")
    public void there_should_be_menu_options(Integer count) {

        System.out.println("count = "+count);
    }


    @Then("location should be {string}")
    public void location_should_be(String expectedLocation) {

        MapPage mapPage = new MapPage();

        String actualLocation = mapPage.location.getText();
        Assert.assertEquals(expectedLocation, actualLocation);

    }


}
