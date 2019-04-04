package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.HomePage;
import org.domcek.tests.page_objects.ParticipantInterfacePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParticipantInterfaceTest extends DriverBase {
    private ParticipantInterfacePage page;

    @Before
    public void before() {
        try {
            page = new ParticipantInterfacePage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() throws Exception {
        openUrl("/login");
        page.getEmajl().sendKeys("test@test1.sk");
        page.getPassword().sendKeys("heslo123");
        page.getButtonLogin().click();
        HomePage homePage = new HomePage();
        Assert.assertEquals(homePage.getNewsStory().getText(), "NAJNOVŠIE");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/home");
        openUrl("/user/profile");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/user/profile");
        Assert.assertEquals(page.getProfile().getText(), "Tvoj Profil");
        Assert.assertEquals(page.getPersonalInformation().getText(), "Osobne údaje");
    }
}
