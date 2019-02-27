package org.domcek.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

class Page {
    protected WebDriver driver;

    protected WebElement waitForElement(By by) {
        return new WebDriverWait(driver, 20)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(by)
                );
    }

    protected List<WebElement> waitForElements(By by) {
        return new WebDriverWait(driver, 20)
                .until(ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(by)
                );
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }
}
