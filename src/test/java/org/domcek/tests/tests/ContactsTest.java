package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.ContactsPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContactsTest extends DriverBase {
    private ContactsPage page;

    @Before
    public void before() {
        try {
            page = new ContactsPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void maps() throws Exception {
        openUrl("/contact");
        Assert.assertEquals(page.getCurrentURL(), "http://domcek.sebastiansimko.sk/contact");
        Assert.assertNotEquals(page.getMaps(), null);

    }

    @Test
    public void cooperate() throws Exception{
        openUrl("/contact");
        Assert.assertEquals(page.getCountCooperate(), 7);
    }

}
