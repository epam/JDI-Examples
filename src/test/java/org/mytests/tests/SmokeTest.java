package org.mytests.tests;

import org.testng.annotations.Test;

import static java.util.Comparator.comparing;
import static org.mytests.uiobjects.wwwepam.enums.HeaderMenu.CAREERS;
import static org.mytests.uiobjects.wwwepam.EpamSite.*;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class SmokeTest extends InitTests {

    @Test
    public void simpliestTest() {
        homePage.open();
    }
    @Test
    public void oneActionTest() {
        homePage.shouldBeOpened();
        headerMenu.select(CAREERS);
        careerPage.checkOpened();
    }

}
