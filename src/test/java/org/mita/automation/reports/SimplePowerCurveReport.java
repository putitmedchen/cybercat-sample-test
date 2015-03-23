package org.mita.automation.reports;

import org.apache.automation.enums.ReportTypes;
import org.apache.automation.features.LoginFeature;
import org.apache.automation.features.ReportsFeature;
import org.apache.automation.models.PowerCurveParameters;
import org.apache.automation.utils.User;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCFeature;
import org.cybercat.automation.annotations.CCTestCase;
import org.cybercat.automation.testng.TestNGTestCase;
import org.testng.annotations.Test;

/**
 * Created by sgo on 15.01.2015.
 */

@CCTestCase(description = "it is designed to generate power curve report with all default parameters")
public class SimplePowerCurveReport extends TestNGTestCase{
    
    @CCFeature
    private ReportsFeature reportsFeature;
    @CCFeature
    private LoginFeature loginFeature;
    
    
    @Test
    public void login() throws AutomationFrameworkException {
        loginFeature.login(User.generateUser());
        
    }
    
    @Test(dependsOnMethods = "login")
    public void generatePowerCurveReport() throws AutomationFrameworkException {
        reportsFeature.checkReportsPresence(ReportTypes.values());
        reportsFeature.generatePowerCurveReport(PowerCurveParameters.generateParameters());
        
    }
    
    
    
    @Override
    public void setup() throws AutomationFrameworkException {
        
    }
}
