package org.apache.automation.features;

import org.apache.automation.enums.ReportTypes;
import org.apache.automation.models.*;
import org.cybercat.automation.AutomationFrameworkException;

/**
 * Created by sgo on 14.01.2015.
 */
public interface ReportsFeature {
    
    ReportsFeature checkReportsPresence(ReportTypes... reports) throws AutomationFrameworkException;
    
    ReportsFeature generatePowerCurveReport(PowerCurveParameters powerCurveParameters) throws AutomationFrameworkException;

    ReportsFeature generateProductionEfficiencyReport(ProductionEfficiencyParameters productionEfficiencyParameters) throws AutomationFrameworkException;

    ReportsFeature generateProductionOverviewReport(ProductionOverviewParameters productionOverviewParameters) throws AutomationFrameworkException;

    ReportsFeature generateWindRoseReport(WindRoseReportParameters windRoseReportParameters) throws AutomationFrameworkException;

    ReportsFeature generateStatusCodeStatisticReport(StatusCodeStatisticParameters statusCodeStatisticParameters) throws AutomationFrameworkException;

    ReportsFeature generateStatusCodeTrendReport(StatusCodeTrendParameters statusCodeTrendParameters) throws AutomationFrameworkException;
}
