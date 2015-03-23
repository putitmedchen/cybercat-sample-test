package org.apache.automation.features;

import org.apache.automation.pages.LandingPage;
import org.apache.automation.pages.LoginPage;
import org.apache.automation.utils.User;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCPageObject;
import org.cybercat.automation.test.AbstractFeature;

/**
 * Created by sgo on 14.01.2015.
 */
public class LoginFeatureImpl extends AbstractFeature implements LoginFeature  {
   
    @CCPageObject
    private LandingPage landingPage;
    @CCPageObject
    private LoginPage loginPage;
    
    @Override
    public LoginFeature login(User user) throws AutomationFrameworkException {
        landingPage.loginToMiscout();
        loginPage.typeCredentials(user.getLogin(), user.getPassword());
        return this;
    }

}
