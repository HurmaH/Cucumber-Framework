package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyTeamPage extends NavigationMenu {

    @FindBy(xpath = "//p[.='name']/../p[1]")
	public List<WebElement> allNames;

	@FindBy(xpath = "//p[.='role']/../p[1]")
	public List<WebElement> allRoles;


	@FindBy(xpath = "//h1[.='team']/../h2")
	public WebElement teamName;


}
