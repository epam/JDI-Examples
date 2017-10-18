package org.mytests.tests.example;

import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.site.JDIExampleSite.homePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.login;

public class SimpleTest extends SimpleTestsInit {

    @Test
    public void loginTest() {
        homePage.open();
        login();
        homePage.checkOpened();
    }
}
