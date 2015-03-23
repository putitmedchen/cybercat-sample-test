package org.mita.automation.reports;

import org.apache.automation.features.LoginFeature;
import org.apache.automation.features.ReportsFeature;
import org.apache.automation.models.WindRoseReportParameters;
import org.apache.automation.utils.User;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCFeature;
import org.cybercat.automation.annotations.CCTestCase;
import org.cybercat.automation.testng.TestNGTestCase;
import org.testng.annotations.Test;

/**
 * Created by sgo on 3/16/2015.
 */
@CCTestCase(description = "it is designed to check simple Wind Rose Report ")
public class SimpleWindRoseReport extends TestNGTestCase {
    
    @CCFeature
    private LoginFeature loginFeature;
    
    @CCFeature
    private ReportsFeature reportsFeature;
    
    
    @Test
    public void login() throws AutomationFrameworkException {
        loginFeature.login(User.generateUser());
        
    }
    
    @Test(dependsOnMethods = "login")
    public void generatePowerCurveReport() throws AutomationFrameworkException {
        reportsFeature.generateWindRoseReport(WindRoseReportParameters.generateParameters());
        
    }
    @Override
    public void setup() throws AutomationFrameworkException {
        
    }
}
