package org.mita.automation;

import org.apache.automation.features.LoginFeature;
import org.apache.automation.features.MapViewFeature;
import org.apache.automation.utils.User;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCFeature;
import org.cybercat.automation.annotations.CCTestCase;
import org.cybercat.automation.testng.TestNGTestCase;
import org.testng.annotations.Test;

/**
 * Created by sgo on 3/24/2015.
 */
@CCTestCase(description = "it is designed to check possibility to select different targets form site tree")
public class SelectTargetsTest extends TestNGTestCase {

    @CCFeature
    public MapViewFeature mapViewFeature;
    @CCFeature
    public LoginFeature loginFeature;

    @Test
    public void selectRendomTarget() throws AutomationFrameworkException {
        loginFeature.login(User.generateUser());
        mapViewFeature.selectRandomTarget();

    }

    @Override
    public void setup() throws AutomationFrameworkException {

    }
}
