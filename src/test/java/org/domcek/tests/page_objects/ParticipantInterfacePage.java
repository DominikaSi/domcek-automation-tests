package org.domcek.tests.page_objects;

import org.domcek.tests.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ParticipantInterfacePage extends Page {
    private By emajl = By.cssSelector("input[type=text]");
    private By password = By.cssSelector("input[type=password]");
    private By ButtonLogin = By.cssSelector("button[type=submit]");

    private By profile = By.cssSelector(".card-header h3");
    private By personalInformation = By.cssSelector(".card-body h3");

    public ParticipantInterfacePage() throws Exception{driver = DriverBase.getDriver();}

    public WebElement getEmajl(){return this.waitForElement(emajl);}
    public WebElement getPassword(){return driver.findElement(password);}
    public WebElement getButtonLogin(){return driver.findElement(ButtonLogin);}

    public WebElement getProfile() {return this.waitForElement(profile);}
    public WebElement getPersonalInformation() {return driver.findElement(personalInformation);}
}
