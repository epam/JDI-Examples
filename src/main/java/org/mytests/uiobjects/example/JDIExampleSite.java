package org.mytests.uiobjects.example;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.example.pages.HomePage;
import org.mytests.uiobjects.example.pages.LoginForm;
import org.mytests.uiobjects.example.pages.LoginPage;

/**
 * Created by Roman_Iovlev on 8/30/2015.
 */
@JSite(domain = "https://jdi-framework.github.io/tests/")
public class JDIExampleSite extends WebSite {
    @JPage(url = "/")
    public static LoginPage loginPage;
    @JPage(url = "/index.htm", title = "Index Page")
    public static HomePage homePage;

    public static LoginForm loginForm;
}
