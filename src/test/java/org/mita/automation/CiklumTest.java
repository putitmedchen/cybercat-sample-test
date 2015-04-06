package org.mita.automation;

import org.apache.automation.features.CiklumFeature;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCFeature;
import org.cybercat.automation.annotations.CCTestCase;
import org.cybercat.automation.testng.TestNGTestCase;
import org.testng.annotations.Test;

/**
 * Created by sgo on 3/26/2015.
 */

@CCTestCase(description = "it is designed to check apply on ciklum page")
public class CiklumTest extends TestNGTestCase {

    @CCFeature
    private CiklumFeature ciklumFeature;


    @Test
    public void applyOnVacancy() throws AutomationFrameworkException {
        ciklumFeature.applyToJob();

    }

    @Override
    public void setup() throws AutomationFrameworkException {

    }
}
