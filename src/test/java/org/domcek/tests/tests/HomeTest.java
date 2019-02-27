package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.HomePage;
import org.domcek.tests.page_objects.NewsListPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeTest extends DriverBase {
    private HomePage page;

    @Before
    public void before() {
        try {
            page = new HomePage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCount() throws Exception {
        openUrl();
        Assert.assertEquals(page.getCountMenuItems(), 9);
    }

    @Test
    public void testTopNew() throws Exception {
        openUrl();
        Assert.assertEquals(page.getCountNameTopNews(), 4);
        Assert.assertEquals(page.getCountReadMore(), 4);
    }

    @Test
    public void testBestRead() throws Exception {
        openUrl();
        WebElement best = page.getBestRead();

        Assert.assertEquals("NAJČÍTANEJŠIE", best.getText());
        best.click();
        Assert.assertTrue(best.getAttribute("class").contains("active"));
        Assert.assertEquals(page.getCountArticleBest(), 3);
        page.getArticleNextBest().click();

        NewsListPage newsListPage = new NewsListPage();
        Assert.assertEquals("Najčítanejšie aktuality", newsListPage.getPageTitle().getText());
    }

    @Test
    public void testNewsRead() throws Exception {
        openUrl();
        WebElement news = page.getNewsStory();

        Assert.assertEquals("NAJNOVŠIE", news.getText());
        news.click();
        Assert.assertTrue(news.getAttribute("class").contains("active"));
        Assert.assertEquals(page.getCountArticleNews(), 3);
        page.getArticleNextNews().click();

        NewsListPage newsListPage = new NewsListPage();
        Assert.assertEquals("Najnovšie aktuality", newsListPage.getPageTitle().getText());
    }

    @Test
    public void testUnderNav() throws Exception {
        openUrl();
        List<WebElement> navigation = page.getUnderNav();
        Assert.assertEquals(navigation.size(), 7);
        Assert.assertTrue(navigation.get(0).getAttribute("class").contains("disabled"));
        Assert.assertTrue(navigation.get(1).getAttribute("class").contains("active"));
        Assert.assertFalse(navigation.get(navigation.size()-1).getAttribute("class").contains("disabled"));
    }

    @Test
    public void testNavClick() throws Exception {
        openUrl();
        List<WebElement> navigation = page.getUnderNav();
        navigation.get(2).click();
        Assert.assertTrue(navigation.get(2).getAttribute("class").contains("active"));
        navigation.get(navigation.size()-1).getAttribute("class").contains("active");
        navigation.get(navigation.size()-2).click();
        Assert.assertTrue(navigation.get(navigation.size()-1).getAttribute("class").contains("disabled"));


    }

}
