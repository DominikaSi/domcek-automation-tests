package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.DobrodinciPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DobrodinciTest extends DriverBase {
    private DobrodinciPage page;

    @Before
    public void before() {
        try {
            page = new DobrodinciPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDobrodinci() throws Exception {
        openUrl("/page/dobrodinci/nadacia-jozefa-murgasa");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/page/dobrodinci/nadacia-jozefa-murgasa");
        List<WebElement> sideMenuItems = page.getSideMenuItems();
        List<String> titles = new ArrayList<>();
        titles.add("Nadácia Jozefa Murgaša");
        titles.add("Daruj 2% Domčeku - možnosť darovania aj 3 %");
        titles.add("Klub Priateľov blahoslavenej Anky Kolesárovej");
        titles.add("Firmy a ľudia");

        for (int i=0; i<3; i++){
            sideMenuItems.get(i).click();
            Assert.assertEquals(page.getTitle().getText(), titles.get(i));
        }
    }

}
