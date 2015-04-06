package org.apache.automation.pages;

import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.components.*;


/**
 * Created by sgo on 3/24/2015.
 */
public class TargetsTreeFragment extends AbstractPageObject {

    private CheckBox target;

    @Override
    protected void initPageElement() {
        addElement(new GroupElements<CheckBox>("targets", PathType.byXPath, "//li[@class='dynatree-lastsib-sites']/ul/li//span[@class='dynatree-checkbox-sites']", CheckBox.class));
        addElement(new TextContainer("targetName", PathType.byXPath, "//li[@class='dynatree-lastsib-sites']/ul/li//span[@class='dynatree-checkbox-sites']/following-sibling::a"));
    }

    @Override
    protected PageElement getUniqueElement() throws AutomationFrameworkException {
        return getGroupElements("targets");
    }

    public void checkTarget() throws AutomationFrameworkException {
        target = (CheckBox) getGroupElements("targets").getElementRandom();
        target.check();
        target.updatePath("/following-sibling::a");
        target.getName();
        System.out.println("bbbl");
    }
}
