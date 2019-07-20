package com.cybertek.step_definitions;


import com.cybertek.utilities.ConfigurationReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePAgeStepDef {

    @Given("user on the login page")
    public void user_on_the_login_page() {

        System.out.println("User on Logn Page");
        System.out.println("Email from configuration: "+ ConfigurationReader.getProperty("leader_email"));
        System.out.println("Password form configuration: "+ConfigurationReader.getProperty("leader_password"));
    }

    @When("user logs in as a team lead")
    public void user_logs_in_as_a_team_lead() {
        System.out.println("Login as team lead");
    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("Home page is displayed");
    }


    @Then("the title should be correct")
    public void the_title_should_be_correct() {
        System.out.println("The title should be correct");
    }

    @When("user logs in as a team member")
    public void user_logs_in_as_a_team_member() {
        System.out.println("I am logging in as member");
    }

    @When("user logs in as a teacher")
    public void user_logs_in_as_a_teacher() {
        System.out.println("I am logging as a teacher");
    }
}
