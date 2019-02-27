package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.AnkaPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AnkaTest extends DriverBase {
    private AnkaPage page;

    @Before
    public void before() {
        try {
            page = new AnkaPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAnka() throws Exception {
    openUrl("/page/anka/pribeh");
    Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/page/anka/pribeh");
    List<WebElement> sideMenuItems = page.getSideMenuItems();
    List<String> titles = new ArrayList<>();
        titles.add("Príbeh");
        titles.add("Blahorečenie");
        titles.add("Publikácie");
        titles.add("Svedectvá");

        for (int i=0; i<3; i++){
        sideMenuItems.get(i).click();
        Assert.assertTrue(page.getTitle().getText().equals(titles.get(i)));
        }
    }
}

