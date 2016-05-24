package org.mytests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.pages.HomePage;

/**
 * Created by Roman_Iovlev on 8/30/2015.
 */
@JSite(domain = "https://www.epam.com")
class EpamSite extends WebSite {

    @JPage(url = "/", title = "EPAM | Software Product Development Services")
    static HomePage homePage;
}
