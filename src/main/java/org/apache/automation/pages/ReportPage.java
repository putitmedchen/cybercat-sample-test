package org.apache.automation.pages;

import org.apache.automation.enums.ReportTypes;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.components.AbstractPageObject;
import org.cybercat.automation.components.Button;
import org.cybercat.automation.components.PageElement;

import java.util.ArrayList;

/**
 * Created by sgo on 14.01.2015.
 */
public class ReportPage extends AbstractPageObject {

    private ArrayList<Button> reportList;

    @Override
    protected void initPageElement() {
        //reports list
        addElement(new Button("ReportPage.reports", PathType.byXPath, "(//div[@id='report-templates-tree']//a)[1]"));
        addElement(new Button("ReportPage.powerCurve", PathType.byXPath, "(//a[@class='dynatree-title-reports'])[2]"));
        addElement(new Button("ReportPage.productionEfficiency", PathType.byXPath, "(//a[@class='dynatree-title-reports'])[3]"));
        addElement(new Button("ReportPage.productionOverview", PathType.byXPath, "(//a[@class='dynatree-title-reports'])[4]"));
        addElement(new Button("ReportPage.statusCodeStatistic", PathType.byXPath, "(//a[@class='dynatree-title-reports'])[5]"));
        addElement(new Button("ReportPage.statusCodeTrend", PathType.byXPath, "(//a[@class='dynatree-title-reports'])[6]"));
        addElement(new Button("ReportPage.windRose", PathType.byXPath, "(//a[@class='dynatree-title-reports'])[7]"));
        
    }

    @Override
    protected PageElement getUniqueElement() throws AutomationFrameworkException {
        return getButton("ReportPage.reports");
    }

    public void checkPresenceAllReports(ReportTypes... reports) throws AutomationFrameworkException {
        reportList = new ArrayList<>();
        reportList.add(getButton("ReportPage.powerCurve"));
        reportList.add(getButton("ReportPage.productionEfficiency"));
        reportList.add(getButton("ReportPage.productionOverview"));
        reportList.add(getButton("ReportPage.statusCodeStatistic"));
        reportList.add(getButton("ReportPage.statusCodeTrend"));
        reportList.add(getButton("ReportPage.windRose"));

        for (ReportTypes report : reports) {
            for (Button buttonElement : reportList) {
                report.getValue().contains(buttonElement.getText());
            }
        }
    }
    
    public void openPowerCurve() throws AutomationFrameworkException {
        getButton("ReportPage.powerCurve").click();
        
    }

    public void openProductionEfficiency() throws AutomationFrameworkException {
        getButton("ReportPage.productionEfficiency").click();
    }

    public void openProductionOverview() throws AutomationFrameworkException {
        getButton("ReportPage.productionOverview").click();
    }

    public void openWindRose() throws AutomationFrameworkException {
        getButton("ReportPage.windRose").click();
    }

    public void openStatusCodeStatistic() throws AutomationFrameworkException {
        getButton("ReportPage.statusCodeStatistic").click();
    }

    public void openStatusCodeTrend() throws AutomationFrameworkException {
        getButton("ReportPage.statusCodeTrend").click();
    }
}

