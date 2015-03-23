package org.apache.automation.features;

import org.apache.automation.pages.MenuFragment;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCPageObject;
import org.cybercat.automation.test.AbstractFeature;

/**
 * Created by sgo on 02.01.2015.
 */
public class MenuFeatureImpl extends AbstractFeature implements MenuFeature {

    @CCPageObject
    private MenuFragment menuFragment;

    @Override
    public MenuFeature checkMenuItems() throws AutomationFrameworkException {
        menuFragment.checkMenuItems();
        return this;
    }

}
