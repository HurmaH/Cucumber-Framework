package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    public SignInPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signIn;

    @FindBy(tagName = "h1")
    public WebElement title;

    @FindBy(className = "subtitle")
    public WebElement subtitle;

    public static String currentUserEmail;


    //this method was created to reuse in the each stepdefinition class
    public void login (String email, String password) {
        currentUserEmail = email;
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.signIn.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("map")));
    }

}
