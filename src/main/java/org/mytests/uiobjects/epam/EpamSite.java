package org.mytests.uiobjects.epam;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.enums.HeaderMenu;
import org.openqa.selenium.support.FindBy;
import org.mytests.uiobjects.epam.pages.*;

/**
 * Created by Roman_Iovlev on 8/30/2015.
 */
@JSite(domain = "https://www.epam.com")
public class EpamSite extends WebSite {

    @JPage(url = "/", title = "EPAM | Software Product Development Services")
    public static HomePage homePage;

    @FindBy(css = ".tile-menu>li>a")
    public static Menu<HeaderMenu> headerMenu;

    @JPage(url = "/careers", title = "Careers")
    public static CareerPage careerPage;
}
