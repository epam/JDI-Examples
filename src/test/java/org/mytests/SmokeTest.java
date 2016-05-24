package org.mytests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.mytests.EpamSite.*;
import static org.mytests.enums.HeaderMenu.CAREERS;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class SmokeTest extends InitTests {

    @BeforeMethod
    public void before(Method method) throws IOException {
        homePage.isOpened();
    }

    @Test
    public void simpliestTest() {
        homePage.checkOpened();
    }

    @Test
    public void oneActionTest() {
        headerMenu.select(CAREERS);
        careerPage.checkOpened();
    }

}
