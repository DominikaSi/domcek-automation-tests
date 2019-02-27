package org.domcek.tests.page_objects;

import org.domcek.tests.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Page {

    private By activeMenuItems = By.xpath("//*[@id='main-nav']/ul/li[contains(@class,'nav-item') and not(contains(@class, 'd-md-none'))]");
    private By nameTopNews = By.xpath("//div[contains(@class, 'col-md-3 .col-6 news')]//h4");
    private By readMore = By.xpath("//div[contains(@class, 'col-md-3 .col-6 news')]//a/span");
    private By bestRead = By.xpath("//ul/li/a[@href='#best']");
    private By newsStory = By.xpath("//ul/li/a[@href='#news']");
    private By articleBest = By.cssSelector("#best .panel-item");
    private By articleNews = By.cssSelector("#news .panel-item");
    private By articleNextNews = By.cssSelector("#news .btn");
    private By articleNextBest = By.cssSelector("#best .btn");
    private By underNav = By.cssSelector(".pagination li");



    public HomePage() throws Exception { driver = DriverBase.getDriver();}

    public int getCountMenuItems() {return this.waitForElements(activeMenuItems).size();}
    public int getCountNameTopNews() {return this.waitForElements(nameTopNews).size();}
    public int getCountReadMore(){return driver.findElements(readMore).size();}

    public WebElement getBestRead() {return this.waitForElement(bestRead);}
    public WebElement getNewsStory() {return this.waitForElement(newsStory);}

    public int getCountArticleBest(){return  driver.findElements(articleBest).size();}
    public int getCountArticleNews(){return  driver.findElements(articleNews).size();}

    public WebElement getArticleNextNews(){return driver.findElement(articleNextNews);}
    public WebElement getArticleNextBest(){return driver.findElement(articleNextBest);}

    public List<WebElement> getUnderNav() {return this.waitForElements(underNav);}

}
