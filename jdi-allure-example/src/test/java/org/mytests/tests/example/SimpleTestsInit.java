package org.mytests.tests.example;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.mytests.uiobjects.example.JDIExampleSite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

/**
 * Created by Roman_Iovlev on 7/13/2015.
 */
public class SimpleTestsInit extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(JDIExampleSite.class);
        logger.info("Run Tests");
    }
}
