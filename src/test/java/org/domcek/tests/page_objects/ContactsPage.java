package org.domcek.tests.page_objects;

import org.domcek.tests.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsPage extends Page {
    private By maps = By.tagName("iframe");
    private By cooperate =By.cssSelector(".logos .logo");

    public ContactsPage() throws Exception { driver = DriverBase.getDriver();}

    public WebElement getMaps() {return this.waitForElement(maps);}
    public int getCountCooperate(){return this.waitForElements(cooperate).size();}
}
