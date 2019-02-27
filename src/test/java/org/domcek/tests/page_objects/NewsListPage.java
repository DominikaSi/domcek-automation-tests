package org.domcek.tests.page_objects;

import org.domcek.tests.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsListPage extends Page {

    private By pageTitle = By.tagName("h2");
    private By article = By.cssSelector(".news .row");
    private By underNav = By.cssSelector(".pagination li");

    public NewsListPage() throws Exception { driver = DriverBase.getDriver();}

    public WebElement getPageTitle() {return this.waitForElement(pageTitle);}
    public int getCountArticle() {return this.waitForElements(article).size();}
    public List<WebElement> getUnderNav() {return this.waitForElements(underNav);}

}
