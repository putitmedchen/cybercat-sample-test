package org.apache.automation.pages;

import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.components.*;


/**
 * Created by sgo on 02.01.2015.
 */
public class LoginPage extends AbstractPageObject {

    @Override
    protected void initPageElement() {
        addElement(new TextField("LoginPage.userName", PathType.byXPath, "//input[@id='UserName']"));
        addElement(new TextField("LoginPage.password", PathType.byXPath, "//input[@id='Password']"));
        addElement(new Button("LoginPage.loginButton", PathType.byXPath, "//input[@id='login-button']"));
    }

    @Override
    protected PageElement getUniqueElement() throws AutomationFrameworkException {
        return getButton("LoginPage.loginButton");
    }
    
   
    public void typeCredentials(String login, String password) throws AutomationFrameworkException {
        getTextField("LoginPage.userName").typeText(login);
        getTextField("LoginPage.password").typeText(password);
        getButton("LoginPage.loginButton").click();
    }

}
