package org.apache.automation.features;

import org.apache.automation.pages.CiklumPage;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCPageObject;
import org.cybercat.automation.annotations.CCRedirectionStep;
import org.cybercat.automation.test.AbstractFeature;

/**
 * Created by sgo on 3/26/2015.
 */
public class CiklumFeatureImpl extends AbstractFeature implements CiklumFeature {

    @CCPageObject
    private CiklumPage ciklumPage;


    @Override
    @CCRedirectionStep(desctiption = "go to Ciklum page", url = "http://jobs.ciklum.com/search-and-apply/")
    public CiklumFeature applyToJob() throws AutomationFrameworkException {
        ciklumPage.openVacancy();


        return this;
    }
}
