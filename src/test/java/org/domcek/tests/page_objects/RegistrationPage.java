package org.domcek.tests.page_objects;

import org.domcek.tests.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends Page {


    private By name = By.name("first-name");
    private By button =  By.cssSelector("button.btn");
    private By fill = By.cssSelector("span.text-danger");
    private By LastName = By.name("last-name");
    private By phone = By.name("phone");
    private By emajl =By.name("email");
    private By city =By.name("city");
    private By password = By.name("password");
    private By passwordConfirmation = By.name("password-confirmation");
    private By birthDate = By.name("birthDate");
    private By back = By.cssSelector(".vdp-datepicker__calendar:nth-child(4) header>.prev");
    private By year= By.cssSelector(".year.cell");
    private By month= By.cssSelector(".month:last-child");
    private By day= By.cssSelector(".day:nth-child(13)");
    private By ok = By.cssSelector(".far");
    private By H3 = By.tagName("h3");
    private By loginBtn = By.cssSelector(".btn");
    private By formLogin = By.tagName("form");


    public RegistrationPage() throws Exception {driver = DriverBase.getDriver();}

    public WebElement getName(){return this.waitForElement(name);}
    public WebElement getButton() {return driver.findElement(button);}
    public WebElement getFill(){return driver.findElement(fill);}
    public WebElement getLastName(){return driver.findElement(LastName);}
    public WebElement getPhone(){return driver.findElement(phone);}
    public WebElement getEmajl(){return driver.findElement(emajl);}
    public WebElement getCity(){return driver.findElement(city);}
    public WebElement getPassword(){return driver.findElement(password);}
    public WebElement getPasswordConfirmation(){return driver.findElement(passwordConfirmation);}
    public WebElement getBirthDate(){return driver.findElement(birthDate);}
    public WebElement getBack(){return driver.findElement(back);}
    public WebElement getYear(){return driver.findElement(year);}
    public WebElement getMonth(){return driver.findElement(month);}
    public WebElement getDay(){return driver.findElement(day);}
    public WebElement getOk(){return this.waitForElement(ok);}
    public WebElement getH3(){return this.waitForElement(H3);}
    public WebElement getLoginBtn(){return driver.findElement(loginBtn);}
    public WebElement getFormLogin(){return this.waitForElement(formLogin);}



}
