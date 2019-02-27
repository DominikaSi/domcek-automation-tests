package org.domcek.tests.tests;

import org.domcek.tests.DriverBase;
import org.domcek.tests.page_objects.LoginPage;
import org.junit.Before;

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



}
