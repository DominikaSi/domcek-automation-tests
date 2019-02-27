package org.domcek.tests.page_objects;

import org.domcek.tests.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AbouDomcekPage extends Page {

    private By title = By.tagName("h3");
    private By button = By.cssSelector(".parent .fa");
    private By GDPR = By.cssSelector("a[href='/page/o-domceku/ochrana-osobnych-udajov-gdpr']");
    private By ParentDropdown = By.cssSelector(".parent-dropdown");
    private By SideMenuItems = By.cssSelector(".list-group>.list-group-item");


    public AbouDomcekPage() throws Exception{driver = DriverBase.getDriver();}

    public WebElement getTitle() {return this.waitForElement(title);}
    public WebElement getButton() {return driver.findElement(button);}
    public WebElement getGDPR() {return this.waitForElement(GDPR);}
    public WebElement getParentDropdown() {return driver.findElement(ParentDropdown);}
    public List<WebElement> getSideMenuItems() {return driver.findElements(SideMenuItems);}

}
