package org.mita.automation;

import org.apache.automation.features.LoginFeature;
import org.apache.automation.features.MenuFeature;
import org.apache.automation.utils.User;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.addons.common.ScreenshotManager;
import org.cybercat.automation.addons.common.TestLoggerAddon;
import org.cybercat.automation.addons.media.MediaController;
import org.cybercat.automation.addons.yslow.PerformanceReportManager;
import org.cybercat.automation.annotations.CCFeature;
import org.cybercat.automation.annotations.CCTestCase;
import org.cybercat.automation.testng.TestNGTestCase;
import org.testng.annotations.Test;

/**
 * Created by sgo on 14.01.2015.
 */

@CCTestCase(description = "check menu test",features = { MediaController.VIDEO, ScreenshotManager.STEPS_SCREENSHOT, ScreenshotManager.EXCEPTION_SCREENSHOT,
        TestLoggerAddon.FULL_LOG, PerformanceReportManager.PERFOMANCE_REPORT })
public class CheckMenuTest extends TestNGTestCase{
    
    @CCFeature
    private LoginFeature loginFeature;
    @CCFeature
    private MenuFeature menuFeature;

    

    
    @Test(description = "login")
    public void checkMenu() throws AutomationFrameworkException {
        loginFeature.login(User.generateUser());
        menuFeature.checkMenuItems();
        
    }


    @Override
    public void setup() throws AutomationFrameworkException {
        
    }
}
