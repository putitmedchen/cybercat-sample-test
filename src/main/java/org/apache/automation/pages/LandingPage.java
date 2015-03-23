package org.apache.automation.pages;

import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.components.AbstractPageObject;
import org.cybercat.automation.components.Button;
import org.cybercat.automation.components.PageElement;import java.lang.Override;


/**
 * Created by sgo on 02.01.2015.
 */
public class LandingPage extends AbstractPageObject {


    @Override
    protected void initPageElement() {
        addElement(new Button("welcomeButton", PathType.byXPath, "//label[@for='header1']"));
        addElement(new Button("loginButton", PathType.byXPath, "//label[@for='header3']"));
        addElement(new Button("runMiscoutWeb", PathType.byXPath, "//a[@href='webservice']"));
    }

    @Override
    protected PageElement getUniqueElement() throws AutomationFrameworkException {
        return getButton("loginButton");
    }


    public void loginToMiscout() throws AutomationFrameworkException {
        getButton("loginButton").click();
        getButton("runMiscoutWeb").click();
    }
}
