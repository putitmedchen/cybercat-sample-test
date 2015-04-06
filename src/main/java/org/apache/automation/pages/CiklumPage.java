package org.apache.automation.pages;

import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.components.AbstractPageObject;
import org.cybercat.automation.components.Button;
import org.cybercat.automation.components.PageElement;
import org.cybercat.automation.components.SelectorBox;

/**
 * Created by sgo on 3/26/2015.
 */
public class CiklumPage extends AbstractPageObject {
    @Override
    protected void initPageElement() {
        addElement(new SelectorBox("allOffices", PathType.byXPath, "//select[@name='location']"));
        addElement(new Button("searchButton", PathType.byXPath, "//button[@title='search']"));
        addElement(new Button("applyButton", PathType.byXPath, ".//*[@id='sr2']/div[2]/a"));
        addElement(new Button("submitAplication", PathType.byXPath, "//form[@class='main_form']/p/input[@class='submit']"));
    }

    @Override
    protected PageElement getUniqueElement() throws AutomationFrameworkException {
        return getButton("searchButton");
    }

    public void openVacancy() throws AutomationFrameworkException {
        getSelectorBox("allOffices").selectFromSelectBox("Lviv");
        getButton("searchButton").click();

        pause(3000);

        getButton("applyButton").click();

        getButton("submitAplication").click();

    }

}
