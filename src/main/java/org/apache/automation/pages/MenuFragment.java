package org.apache.automation.pages;

import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.components.AbstractPageObject;
import org.cybercat.automation.components.Button;
import org.cybercat.automation.components.PageElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgo on 02.01.2015.
 */
public class MenuFragment extends AbstractPageObject{

    @Override
    protected void initPageElement() {
        addElement(new Button("mapView", PathType.byXPath, "//a[@data-key='Map View']"));
        addElement(new Button("dashBoard", PathType.byXPath, "//a[@data-key='Dashboard']"));
        addElement(new Button("onlineLogger", PathType.byXPath, "//a[@data-key='Online Logger']"));
        addElement(new Button("averageLog", PathType.byXPath, "//a[@data-key='Average Log']"));
        addElement(new Button("scatterPlot", PathType.byXPath, "//a[@data-key='Scatter Plot']"));
        addElement(new Button("statusLog", PathType.byXPath, "//a[@data-key='Status Log']"));
        addElement(new Button("reports", PathType.byXPath, "//ul/li[@class='reports active']/a"));
        addElement(new Button("alarms", PathType.byXPath, "//a[@data-key='Alarms']"));
    }

    @Override
    protected PageElement getUniqueElement() throws AutomationFrameworkException {
        return getButton("mapView");
    }

    private List<Button> menuItems = new ArrayList<>();

    public void checkMenuItems() throws AutomationFrameworkException {
        menuItems.add(getButton("mapView"));
        menuItems.add(getButton("dashBoard"));
        menuItems.add(getButton("onlineLogger"));
        menuItems.add(getButton("averageLog"));
        menuItems.add(getButton("scatterPlot"));
        menuItems.add(getButton("statusLog"));
        menuItems.add(getButton("reports"));
        menuItems.add(getButton("alarms"));


        for (Button button : menuItems) {
            Assert.assertTrue(button.isEnabled(), button.getText() + button.getText() + " element is not enabled");
            Assert.assertTrue(button.isDisplayed(), button.getText() + button.getText() + " unable to display this element");
        }
    }

    public void openMapView() throws AutomationFrameworkException {
        getButton("mapView").click();

    }

    public void openDashBoard() throws AutomationFrameworkException {
        getButton("dashBoard").click();
    }

    public void openOnlineLogger() throws AutomationFrameworkException {
        getButton("onlineLogger").click();
    }

    public void openAverageLogger() throws AutomationFrameworkException {
        getButton("averageLog").click();
    }

    public void openScatterPlot() throws AutomationFrameworkException {
        getButton("scatterPlot").click();
    }

    public void openStatusLog() throws AutomationFrameworkException {
        getButton("statusLog").click();
    }

    public void openReports() throws AutomationFrameworkException {
        getButton("reports").click();
    }

    public void openAlarms() throws AutomationFrameworkException {
        getButton("alarms").click();
    }

}
