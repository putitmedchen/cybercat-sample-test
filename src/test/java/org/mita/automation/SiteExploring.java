package org.mita.automation;

import org.apache.automation.features.IApacheHomeFeature;
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
 * Created by sgo on 15.01.2015.
 */
@CCTestCase(description = "Apache sample test", features = { MediaController.VIDEO, ScreenshotManager.STEPS_SCREENSHOT, ScreenshotManager.EXCEPTION_SCREENSHOT,
        TestLoggerAddon.FULL_LOG, PerformanceReportManager.PERFOMANCE_REPORT })
public class SiteExploring extends TestNGTestCase {

    @CCFeature
    private IApacheHomeFeature sampleFeature;

    @Test
    public void navigateToTomcatProject() throws AutomationFrameworkException {
        sampleFeature
                .runIntegrationTest()
                .gotoAdvertise()
                .gotoApache()
                .sampleNavigate("Tomcat")
            /*.throwException()*/;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.cybercat.automation.test.AbsractTestCase#setup()
     */
    @Override
    public void setup() throws AutomationFrameworkException {
        // TODO Auto-generated method stub
    }

}