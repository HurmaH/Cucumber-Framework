package com.cybertek.runners;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //shows source of feature file package
        glue = "com/cybertek/step_definitions"   //connecting to step_def
        , dryRun = false
        , tags = "@wip"
        //selecting tag from one feature folder
        // tags="@member, @teacher"
)
public class CukesRunner{

}
