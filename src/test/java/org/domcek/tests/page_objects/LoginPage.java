package org.domcek.tests.page_objects;

import org.domcek.tests.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page {

    private By emajl = By.cssSelector("input[type=text]");
    private By password = By.cssSelector("input[type=password]");
    private By ButtonLogin = By.cssSelector("button[type=submit]");
    private By bug = By.className("alert-danger");

    public LoginPage() throws Exception {driver = DriverBase.getDriver();}

    public WebElement getEmajl(){return this.waitForElement(emajl);}
    public WebElement getPassword(){return driver.findElement(password);}
    public WebElement getButtonLogin(){return driver.findElement(ButtonLogin);}
    public WebElement getbug(){return this.waitForElement(bug);}
}
