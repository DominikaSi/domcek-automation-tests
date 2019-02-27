package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.AbouDomcekPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AboutDomcekTest extends DriverBase {
    private AbouDomcekPage page;

    @Before
    public void before() {
        try {
            page = new AbouDomcekPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void hauspage() throws Exception{
        openUrl("/page/o-domceku/domcek");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/page/o-domceku/domcek");
        Assert.assertTrue(page.getTitle().getText().equals("Domček"));
        page.getButton().click();
        Assert.assertTrue(page.getGDPR().isDisplayed());
        Assert.assertTrue(page.getParentDropdown().isDisplayed());
        page.getButton().click();
        Assert.assertFalse(page.getParentDropdown().isDisplayed());
        List<WebElement> sideMenuItems = page.getSideMenuItems();
        List<String> titles = new ArrayList<>();
        titles.add("Domček");
        titles.add("Rozvoj a poslanie");
        titles.add("Tím Domčeka");
        titles.add("Logo Domčeka");
        titles.add("Prístavba CENTRUM PRE MLÁDEŽ");
        titles.add("ARS - dom pre kňazov");
        titles.add("Tímček");
        titles.add("Kniha čistých sŕdc");

        for (int i=0; i<7; i++){
            sideMenuItems.get(i).click();
            Assert.assertTrue(page.getTitle().getText().equals(titles.get(i)));

        }

    }



}
