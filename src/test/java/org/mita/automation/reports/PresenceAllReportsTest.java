package org.mita.automation.reports;

import org.apache.automation.enums.ReportTypes;
import org.apache.automation.features.LoginFeature;
import org.apache.automation.features.ReportsFeature;
import org.apache.automation.utils.User;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCFeature;
import org.cybercat.automation.annotations.CCTestCase;
import org.cybercat.automation.testng.TestNGTestCase;
import org.testng.annotations.Test;

/**
 * Created by sgo on 14.01.2015.
 */
@CCTestCase(description = "it is designed to check presence of all reports")
public class PresenceAllReportsTest extends TestNGTestCase{
   
    @CCFeature
    private LoginFeature loginFeature;
    @CCFeature
    private ReportsFeature reportsFeature;
    
    @Test
    public void loginToMiScout() throws AutomationFrameworkException {
        loginFeature.login(User.generateUser());
        
    }
    
    @Test(dependsOnMethods = "loginToMiScout")
    public void checkReportsPresence() throws AutomationFrameworkException {
        reportsFeature.checkReportsPresence(ReportTypes.values());
        
    }
    
    @Override
    public void setup() throws AutomationFrameworkException {
        
    }
}
