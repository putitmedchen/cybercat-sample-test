package org.apache.automation.features;

import org.apache.automation.enums.ReportTypes;
import org.apache.automation.models.*;
import org.apache.automation.pages.MenuFragment;
import org.apache.automation.pages.ParametersFragment;
import org.apache.automation.pages.ReportPage;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.annotations.CCPageObject;
import org.cybercat.automation.test.AbstractFeature;

/**
 * Created by sgo on 14.01.2015.
 */
public class ReportFeatureImpl extends AbstractFeature implements ReportsFeature {
    
    @CCPageObject
    private ReportPage reportPage;
    @CCPageObject
    private MenuFragment menuFragment;
    @CCPageObject
    private ParametersFragment parametersFragment;
    
    @Override
    public ReportsFeature checkReportsPresence(ReportTypes... reports) throws AutomationFrameworkException {
        menuFragment.openReports();
        reportPage.checkPresenceAllReports(reports);
        return this;
    }

    @Override
    public ReportsFeature generatePowerCurveReport(PowerCurveParameters powerCurveParameters) throws AutomationFrameworkException {
        reportPage.openPowerCurve();
        parametersFragment.generatePowerCurveReport(powerCurveParameters);
        return this;
    }

    @Override
    public ReportsFeature generateProductionEfficiencyReport(ProductionEfficiencyParameters productionEfficiencyParameters) throws AutomationFrameworkException {
        reportPage.openProductionEfficiency();
        parametersFragment.generateProductionEfficiencyReport(productionEfficiencyParameters);
        return this;
    }
    
    @Override
    public ReportsFeature generateProductionOverviewReport(ProductionOverviewParameters productionOverviewParameters) throws AutomationFrameworkException {
        reportPage.openProductionOverview();
        parametersFragment.generateProductionOverviewReport(productionOverviewParameters);
        return  this;
    }

    @Override
    public ReportsFeature generateWindRoseReport(WindRoseReportParameters windRoseParameters) throws AutomationFrameworkException {
        reportPage.openWindRose();
        parametersFragment.generateWindRoseReport(windRoseParameters);
        return  this;
    }
    
    @Override
    public ReportsFeature generateStatusCodeStatisticReport(StatusCodeStatisticParameters statusCodeStatisticParameters) throws AutomationFrameworkException {
        reportPage.openStatusCodeStatistic();
        parametersFragment.generateStatusCodeStatisticReport(statusCodeStatisticParameters);
        return this;
        
    }
    
    @Override
    public ReportsFeature generateStatusCodeTrendReport(StatusCodeTrendParameters statusCodeTrendParameters) throws AutomationFrameworkException {
        reportPage.openStatusCodeTrend();
        parametersFragment.generateStatusCodeTrendReport(statusCodeTrendParameters);
        return this;
        
    }


}
