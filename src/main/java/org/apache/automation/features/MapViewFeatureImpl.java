package org.apache.automation.features;

import org.apache.automation.pages.TargetsTreeFragment;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCPageObject;
import org.cybercat.automation.test.AbstractFeature;

/**
 * Created by sgo on 3/24/2015.
 */
public class MapViewFeatureImpl extends AbstractFeature implements MapViewFeature {

    @CCPageObject
    public TargetsTreeFragment targetsTreeFragment;

    @Override
    public MapViewFeature selectRandomTarget() throws AutomationFrameworkException {
        targetsTreeFragment.checkTarget();
        return this;
    }
}
