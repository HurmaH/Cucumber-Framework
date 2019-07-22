package com.cybertek.step_definitions;

import com.cybertek.pages.MySelfPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class MyDetailsStepDef {//it was TeamDetailsStepDef

    @Then("the user should see their information:")
    public void the_user_should_see_their_information(Map<String, String> userInfo) {
       // For automatic transformation, change DataTable to one of
        // E,
        // List<E>,
        // List<List<E>>,
        // List<Map<K,V>>,
        // Map<K,V> or
        // Map<K, List<V>>.
        // E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal
        // For other transformations you can register a DataTableType.

        System.out.println(userInfo);

        String name = userInfo.get("name"); //same keys from fature file
        System.out.println("Name="+name);

        String role = userInfo.get("role");
        System.out.println("Role="+role);
        String team = userInfo.get("team");
        System.out.println("team = " + team);
        String batch = userInfo.get("batch");
        System.out.println("batch = " + batch);
        String campus = userInfo.get("campus");
        System.out.println("campus = " + campus);

        //actual Test Part
        MySelfPage mySelfPage = new MySelfPage();
        String actualName = mySelfPage.name.getText();
        String actualRole = mySelfPage.role.getText();
        String actualTeam = mySelfPage.team.getText();
        String actualBatch = mySelfPage.batch.getText();
        String actualCampus = mySelfPage.campus.getText();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(role, actualRole);
        Assert.assertEquals(team, actualTeam);
        Assert.assertEquals(batch, actualBatch);
        Assert.assertEquals(campus, actualCampus);


    }

}
