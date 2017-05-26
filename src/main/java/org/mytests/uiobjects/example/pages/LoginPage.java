package org.mytests.uiobjects.example.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.uiobjects.example.entities.User;
import org.openqa.selenium.support.FindBy;

import static org.mytests.uiobjects.example.JDIExampleSite.loginForm;
import static org.mytests.uiobjects.example.JDIExampleSite.loginPage;

/**
 * Created by Roman_Iovlev on 10/22/2015.
 */
public class LoginPage extends WebPage {
    @FindBy(css = ".profile-photo")
    public Label profilePhoto;

    public void login() {
        loginPage.profilePhoto.click();
        loginForm.loginAs(new User());
    }
}
