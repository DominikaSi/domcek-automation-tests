package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.HomePage;
import org.domcek.tests.page_objects.NewsListPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsTest extends DriverBase {
    private NewsListPage page;

    @Before
    public void before() {
        try {
            page = new NewsListPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNewsList() throws Exception {
        openUrl("/news-list/latest");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/news-list/latest");
        Assert.assertEquals(page.getCountArticle(), 10);

        List<WebElement> navigation = page.getUnderNav();


        Assert.assertEquals(navigation.size(), 6);
        Assert.assertTrue(navigation.get(0).getAttribute("class").contains("disabled"));
        Assert.assertTrue(navigation.get(1).getAttribute("class").contains("active"));
        Assert.assertFalse(navigation.get(navigation.size()-1).getAttribute("class").contains("disabled"));

        /*navigation.get(2).click();
        Assert.assertTrue(navigation.get(2).getAttribute("class").contains("active"));
        navigation.get(navigation.size()-1).getAttribute("class").contains("active");
        navigation.get(navigation.size()-2).click();
        Assert.assertTrue(navigation.get(navigation.size()-1).getAttribute("class").contains("disabled"));*/
    }

    @Test
    public void testBestList() throws Exception {
        openUrl("/news-list/best");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/news-list/best");
        Assert.assertEquals(page.getCountArticle(), 10);

        List<WebElement> navigation = page.getUnderNav();
        Assert.assertTrue(navigation.get(0).getAttribute("class").contains("disabled"));
        Assert.assertTrue(navigation.get(1).getAttribute("class").contains("active"));
        Assert.assertFalse(navigation.get(navigation.size()-1).getAttribute("class").contains("disabled"));

        /*navigation.get(2).click();
        Assert.assertTrue(navigation.get(2).getAttribute("class").contains("active"));
        navigation.get(navigation.size()-1).getAttribute("class").contains("active");
        navigation.get(navigation.size()-2).click();
        Assert.assertTrue(navigation.get(navigation.size()-1).getAttribute("class").contains("disabled"));*/
    }


}
