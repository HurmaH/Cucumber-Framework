package com.cybertek.step_definitions;


import com.cybertek.pages.MapPage;
import com.cybertek.pages.SignInPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ro.Si;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.misc.SignalHandler;

public class HomePAgeStepDef {



    @Given("user on the login page")
    public void user_on_the_login_page() {

        System.out.println("I am opening Login Page");
        //open login page of the application
        //url is the properties file
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in as a team lead")
    public void user_logs_in_as_a_team_lead() {
        System.out.println("Login as team lead");
        System.out.println("Email from configuration: "+ ConfigurationReader.getProperty("leader_email"));
        System.out.println("Password form configuration: "+ConfigurationReader.getProperty("leader_password"));

        SignInPage signInPage = new SignInPage();
        signInPage.email.sendKeys(ConfigurationReader.getProperty("leader_email"));
        signInPage.password.sendKeys(ConfigurationReader.getProperty("leader_password"));
        signInPage.signIn.click();
    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {

        System.out.println("Home page is displayed");
        String expected  = "map";

        MapPage mapPage = new MapPage();
        //Wait options:
        //1. BrowserUtils.wait(3);//Thread.sleep
        BrowserUtils.waitForVisibility(mapPage.title, 10);
        //3. ExpectedCondition,textToBe
        //4. ExpectedConditions,urlToBe

       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //3. wait.until(ExpectedConditions.textToBePresentInElement(mapPage.header, "map"));
        //4.
       // wait.until(ExpectedConditions.urlToBe("https://cybertek-reservation-qa5.herokuapp.com/map"));

        String actual = mapPage.title.getText();
        //Assertions are coming from JUnit
        Assert.assertEquals(expected, actual);

    }


    @Then("the title should be correct")
    public void the_title_should_be_correct() {
        System.out.println("The title should be correct");
    }

    @When("user logs in as a team member")
    public void user_logs_in_as_a_team_member() {
        System.out.println("I am logging in as member");
        SignInPage signInPage = new SignInPage();
        signInPage.email.sendKeys(ConfigurationReader.getProperty("member_email"));
        signInPage.password.sendKeys(ConfigurationReader.getProperty("member_password"));
        signInPage.signIn.click();

    }

    @When("user logs in as a teacher")
    public void user_logs_in_as_a_teacher() {
        System.out.println("I am logging as a teacher");

        SignInPage signInPage = new SignInPage();
        signInPage.email.sendKeys(ConfigurationReader.getProperty("teacher_email"));
        signInPage.password.sendKeys(ConfigurationReader.getProperty("teacher_password"));
        signInPage.signIn.click();

    }
}
