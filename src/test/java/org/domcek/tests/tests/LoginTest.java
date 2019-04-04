package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.HomePage;
import org.domcek.tests.page_objects.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends DriverBase {
    private LoginPage page;

    @Before
    public void before() {
        try {
            page = new LoginPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void loginFalsEmajl() throws Exception {
        openUrl("/login");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/login");
        page.getEmajl().sendKeys("moj@mejl.sk");
        page.getPassword().sendKeys("heslo123");
        page.getButtonLogin().click();
        Assert.assertTrue(page.getbug().isDisplayed());
    }

    @Test
    public void loginFailsPassword() throws Exception{
        openUrl("/login");
        page.getEmajl().sendKeys("test@test1.sk");
        page.getPassword().sendKeys("heslo123456");
        page.getButtonLogin().click();
        Assert.assertTrue(page.getbug().isDisplayed());
    }

    @Test
    public void loginGodLogin() throws Exception{
        openUrl("/login");
        page.getEmajl().sendKeys("test@test1.sk");
        page.getPassword().sendKeys("heslo123");
        page.getButtonLogin().click();
        HomePage homePage = new HomePage();
        Assert.assertEquals(homePage.getNewsStory().getText(), "NAJNOVŠIE");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/home");
    }

}
