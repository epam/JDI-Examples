package org.mytests.tests.example;

import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.JDIExampleSite.*;

/**
 * Created by Roman_Iovlev on 5/26/2017.
 */
public class SimpleExampleTest extends SimpleTestsInit {
    @Test
    public void loginExample() {
        homePage.open();
        login();
        homePage.checkOpened();
    }
}
