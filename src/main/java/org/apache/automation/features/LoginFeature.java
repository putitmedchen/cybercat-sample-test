package org.apache.automation.features;

import org.apache.automation.utils.User;
import org.cybercat.automation.AutomationFrameworkException;

/**
 * Created by sgo on 14.01.2015.
 */
public interface LoginFeature   {
    
    LoginFeature login(User user) throws AutomationFrameworkException;
}
