package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

   public WebDriver driver;

    @Before(order =2)
    public void setUp() {
        System.out.println("I am setting up the test from the Hooks class!!!");
        driver=Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // you can also add maximize screen here
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Ia m reporting results!!!");

        //I want to take screenshot when current scenario fails
        //scenario.isFailed() -->tells if the scenario failed or not
        if(scenario.isFailed()) {
            //this line for taking screenshot
            final byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //this line adding the screen shot to repoty
            scenario.embed(screenshot, "image/png");
        }

        System.out.println("Closing driver");
        Driver.getDriver().close();
    }

//    @Before(value = "@teacher", order = 11)
//    public void setUpTeacher(){
//        System.out.println("Set up teacher test");
//    }

//    @Before(value = "@db")
//    public void setUpDBConnection(){
//        DatabaseUtility.createConnection();
//    }
//
//    @After(value = "db")
//    public void closeDBConnection(){
//        DatabaseUtility.closeConnection();
//    }
}
