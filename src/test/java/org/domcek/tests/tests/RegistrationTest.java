package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.RegistrationPage;
import org.domcek.tests.utils.FormUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class RegistrationTest extends DriverBase {
    private RegistrationPage page;

    @Before
    public void before() {
        try {
            page = new RegistrationPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void onlyName() throws Exception {
        openUrl("/register");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/register");
        page.getName().sendKeys("Dominika");
        page.getButton().click();
        Assert.assertTrue(page.getFill().isDisplayed());

    }

//    @Test
//    public void dateTest() throws Exception {
//        openUrl("/register");
//        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/register");
//        page.getName().sendKeys("Dominika");
//        page.getLastName().sendKeys("Priezviskova");
//        page.getButton().click();
//        Assert.assertTrue(page.getFill().isDisplayed());
// }

    @Test
    public void goodTest() throws Exception {
        openUrl("/register");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/register");
        page.getName().sendKeys("Dominika");
        page.getLastName().sendKeys("Priezviskova");
        page.getBirthDate().click();
        page.getBack().click();
        page.getYear().click();
        page.getMonth().click();
        page.getDay().click();
        page.getPhone().sendKeys("0901111222");
        page.getEmajl().sendKeys(FormUtil.getRandomString(10) + "@dva.sk");
        page.getCity().sendKeys("Kosice");
        page.getPassword().sendKeys("mrkvicka123");
        page.getPasswordConfirmation().sendKeys("mrkvicka123");
        page.getButton().click();
        page.getOk().isDisplayed();
        Assert.assertEquals(page.getH3().getText(), "Registrácia bola úspešná môžeš pokračovať na prihlásenie");
        WebElement btn = page.getLoginBtn();
        btn.click();
        Assert.assertTrue(page.getFormLogin().isDisplayed());
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/login");

    }


}
