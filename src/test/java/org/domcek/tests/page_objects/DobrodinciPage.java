package org.domcek.tests.page_objects;

import org.domcek.tests.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DobrodinciPage extends Page {

    private By title = By.cssSelector("h3");
    private By SideMenuItems = By.cssSelector(".list-group>.list-group-item>a");

    public DobrodinciPage() throws Exception{ driver = DriverBase.getDriver();}

    public WebElement getTitle() {return this.waitForElement(title);}
    public List<WebElement> getSideMenuItems() {return this.waitForElements(SideMenuItems);}

}
