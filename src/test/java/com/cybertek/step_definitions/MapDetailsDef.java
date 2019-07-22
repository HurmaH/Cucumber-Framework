package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.MyTeamPage;
import com.cybertek.pages.NavigationMenu;
import com.cybertek.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MapDetailsDef {

    @Then("The user should be able to see following rooms:")
    public void the_user_should_be_able_to_see_following_rooms(List <String> rooms) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(rooms);
        System.out.println(rooms.size());
    }

    @When("the user goes to the {string} page")
    public void the_user_goes_to_the_page(String page) {

        MapPage mapPage = new MapPage();
        //to be able to use for differnt pages in future switch was used
        switch (page){
            case "map":
                mapPage.map.click();
                break;
            case "hunt":
                mapPage.hunt.click();
                break;
            case "my self":
                mapPage.goToSelf();
                break;
            case "my team":
                mapPage.goToTeam();
                break;
        }
    }

    @Then("following team members should be displayed:")
    public void following_team_members_should_be_displayed(List <String> members) {

        System.out.println(members);

        //get the list of all members in a string list
        MyTeamPage myTeam = new MyTeamPage();

        List <String> actualMembers = BrowserUtils.getElementsText(myTeam.allNames);

        //Assert.assertEquals(members, actualMembers);//it might be useful if there the order of names are same in two list
        Assert.assertEquals(members.size(), actualMembers.size());
        Assert.assertTrue(members.contains(actualMembers));
    }



//    @Then("I should be able to see {string} room")
//    public void i_should_be_able_to_see_room(String roomName) {
//        //get list of all the room names and convert to list String
//        MapPage mapPage = new MapPage();
//
//        //getting list of rooms as a WebElement from the mappage
//        //and returning it as a list of string using utility method
//        List <String> allRooms = BrowserUtils.getElementsText(mapPage.allRooms);
//
//        //verify that list contains the expected room name
//        Assert.assertTrue("Room was not found: "+(roomName), allRooms.contains(roomName));//will give message in case it fails
//    }
}
