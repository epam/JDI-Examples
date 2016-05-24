package org.mytests;

import org.testng.annotations.Test;

import static org.mytests.EpamSite.*;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class SmokeTest extends InitTests{

    @Test
    public void simpleTest() {
        homePage.open();
        homePage.checkOpened();
    }

}
