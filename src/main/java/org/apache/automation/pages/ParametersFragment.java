package org.apache.automation.pages;

import org.apache.automation.models.*;
import org.cybercat.automation.AutomationFrameworkException;
import org.cybercat.automation.components.*;
import org.openqa.selenium.Point;
import org.testng.Assert;

/**
 * Created by sgo on 14.01.2015.
 */
public class ParametersFragment extends AbstractPageObject {
    
    Point a1 = new Point(5, 85);
    Point b1 = new Point(10, 90);
    
    @Override
    protected void initPageElement() {
        addElement(new Button("ParametersPageFragment.parameters", PathType.byXPath, "//button[@id='report-params-button']"));
        
        addElement(new CheckBox("ParametersPageFragment.comparePowerCurve", PathType.byXPath, "//input[@id='p_SHOW_COMPARABLE_POWER_CURVE']"));
        addElement(new CheckBox("ParametersPageFragment.showDetailsForTurbines", PathType.byXPath, "//input[@id='p_SHOW_DETAIL_BY_TURBINES']"));
        addElement(new CheckBox("ParametersPageFragment.normalizePowerCurve", PathType.byXPath, "//input[@id='p_NORMALIZE_POWER_CURVE']"));
        addElement(new CheckBox("ParametersPageFragment.normalizeData", PathType.byXPath, "//input[@id='p_NORMALIZE_DATA']"));

        addElement(new SelectorBox("ParametersPageFragment.outdoorTemperature", PathType.byXPath, "//select[@id='p_OUTDOOR_TEMP_DATA_CLASS']"));
        
        addElement(new SvgChart("ParametersPageFragment.parametersResize", PathType.byXPath, "(//div[@class='nicescroll-rails']/div)[last()]"));
        
        addElement(new SelectorBox("ParametersPageFragment.powerMeasurementUnits", PathType.byXPath, "//select[@id='p_POWER_MEASURE_UNITS']"));
        addElement(new SelectorBox("ParametersPageFragment.powerDataSource", PathType.byXPath, "//select[@id='p_POWER_DATA_CLASS']"));
        addElement(new SelectorBox("ParametersPageFragment.reactiveProductionDataSource", PathType.byXPath, "//select[@id='p_REACTIVE_POWER_DATA_CLASS']"));
        addElement(new SelectorBox("ParametersPageFragment.reactiveProductionMeasurementUnits", PathType.byXPath, "//select[@id='p_REACTIVE_PRODUCTION_MEASURE_UNITS']"));
        addElement(new SelectorBox("ParametersPageFragment.windSpeedDataSource", PathType.byXPath, "//select[@id='p_WIND_SPEED_DATA_CLASS']"));
        addElement(new SelectorBox("ParametersPageFragment.dataSet", PathType.byXPath, "//select[@id='p_SOURCE_LOG_TYPE']"));

        addElement(new TextField("ParametersPageFragment.binCount", PathType.byXPath, "//input[@id='p_BIN_COUNT']"));
        addElement(new TextField("ParametersPageFragment.binSpan", PathType.byXPath, "//input[@id='p_BIN_SPAN']"));
        addElement(new TextField("ParametersPageFragment.windSpeedOffset", PathType.byXPath, "//input[@id='p_WIND_SPEED_OFFSET']"));
        
        addElement(new SelectorBox("ParametersPageFragment.aggregationType", PathType.byXPath, "//select[@id='p_DATE_AGGREGATION_TYPE']"));
        addElement(new TextField("ParametersPageFragment.skipCodes", PathType.byXPath, "//input[@id='p_SKIP_STATUS_CODES_AMOUNT_TIME_X_SEC']"));
        
        addElement(new Button("ParametersPageFragment.generate", PathType.byXPath, "//button[@id='generate-report']"));



        addElement(new JQButton("scrollButton", PathType.byXPath, "(//div[last()])"));

    }

    @Override
    protected PageElement getUniqueElement() throws AutomationFrameworkException {
        return getButton("ParametersPageFragment.parameters");
    }
    
    public void generatePowerCurveReport(PowerCurveParameters powerCurveParameters) throws AutomationFrameworkException {
        getButton("ParametersPageFragment.parameters").click();

        Assert.assertTrue(getCheckBox("ParametersPageFragment.comparePowerCurve").isChecked());
        Assert.assertTrue(getCheckBox("ParametersPageFragment.showDetailsForTurbines").isChecked());
        Assert.assertTrue(getCheckBox("ParametersPageFragment.normalizePowerCurve").isChecked());

        getSelectorBox("ParametersPageFragment.outdoorTemperature").selectorBox(powerCurveParameters.getOutdoorTemperatureDataSource().getValue());

     //   execJS("$('div:last').css('top', '95px')");
      //  execJS("$('div:last').css({'top': '95px'})");
       // execJS("$('div:last').css({top:'100px',position:'fixed'})");
       // execJS("$('div:last').css({top:'100px',position:'fixed'})");
        execJS("$('div:last').animate({top: '100px', 200})");
     //   execJS("$('div:last').css({'top': '100px'})");
      //  execJS("$('div:last').scrollTop(95)");
        


        getSelectorBox("ParametersPageFragment.powerMeasurementUnits").selectorBox(powerCurveParameters.getPowerMeasurementUnits().getValue());
        getSelectorBox("ParametersPageFragment.powerDataSource").selectorBox(powerCurveParameters.getPowerDataSource().getValue());
        getSelectorBox("ParametersPageFragment.windSpeedDataSource").selectorBox(powerCurveParameters.getWindSpeedDataSource().getValue());
        getSelectorBox("ParametersPageFragment.dataSet").selectorBox(powerCurveParameters.getDataSet().getValue());

       
        
        getTextField("ParametersPageFragment.binCount").typeText(powerCurveParameters.getBinCount());
        getTextField("ParametersPageFragment.binSpan").typeText(powerCurveParameters.getBinSpan());
        getTextField("ParametersPageFragment.windSpeedOffset").typeText(powerCurveParameters.getWindSpeedOffset());

        getTextField("ParametersPageFragment.windSpeedOffset").typeText(powerCurveParameters.getWindSpeedOffset());
        
        getButton("ParametersPageFragment.generate").click();
    }

    public void generateProductionEfficiencyReport(ProductionEfficiencyParameters productionEfficiencyParameters) throws AutomationFrameworkException {
        getButton("ParametersPageFragment.parameters").click();
        
        getSelectorBox("ParametersPageFragment.powerMeasurementUnits").selectorBox(productionEfficiencyParameters.getPowerMeasurementUnits().getValue());
        getSelectorBox("ParametersPageFragment.powerDataSource").selectorBox(productionEfficiencyParameters.getPowerDataSource().getValue());
        getSelectorBox("ParametersPageFragment.windSpeedDataSource").selectorBox(productionEfficiencyParameters.getWindSpeedDataSource().getValue());
        getSelectorBox("ParametersPageFragment.dataSet").selectorBox(productionEfficiencyParameters.getWindSpeedDataSource().getValue());
        
        getButton("ParametersPageFragment.generate").click();
    }

    public void generateProductionOverviewReport(ProductionOverviewParameters productionOverviewParameters) throws AutomationFrameworkException {
        getButton("ParametersPageFragment.parameters").click();
        
        getSelectorBox("ParametersPageFragment.powerDataSource").selectorBox(productionOverviewParameters.getProductionDataSource().getValue());
        getSelectorBox("ParametersPageFragment.powerMeasurementUnits").selectorBox(productionOverviewParameters.getPowerMeasurementUnits().getValue());
        getSelectorBox("ParametersPageFragment.windSpeedDataSource").selectorBox(productionOverviewParameters.getWindSpeedDataSource().getValue());
        getSelectorBox("ParametersPageFragment.reactiveProductionDataSource").selectorBox(productionOverviewParameters.getReactiveProductionDataSource().getValue());
        getSelectorBox("ParametersPageFragment.reactiveProductionMeasurementUnits").selectorBox(productionOverviewParameters.getReactiveProductionMeasurementUnits().getValue());
        getSelectorBox("ParametersPageFragment.dataSet").selectorBox(productionOverviewParameters.getDataSet().getValue());

        getButton("ParametersPageFragment.generate").click();
    }

    public void generateWindRoseReport(WindRoseReportParameters windRoseParameters) throws AutomationFrameworkException {

        getButton("ParametersPageFragment.parameters").click();
        
        Assert.assertTrue(getCheckBox("ParametersPageFragment.showDetailsForTurbines").isChecked());
        Assert.assertTrue(getCheckBox("ParametersPageFragment.normalizeData").isChecked());
        getSelectorBox("ParametersPageFragment.outdoorTemperature").selectorBox(windRoseParameters.getOutdoorTemperatureDataSource().getValue());
        getSelectorBox("ParametersPageFragment.powerMeasurementUnits").selectorBox(windRoseParameters.getPowerMeasurementUnits().getValue());
        getSelectorBox("ParametersPageFragment.powerDataSource").selectorBox(windRoseParameters.getPowerDataSource().getValue());
        getSelectorBox("ParametersPageFragment.windSpeedDataSource").selectorBox(windRoseParameters.getWindSpeedDataSource().getValue());
        getSelectorBox("ParametersPageFragment.dataSet").selectorBox(windRoseParameters.getDataSet().getValue());

        getButton("ParametersPageFragment.generate").click();
    }

    public void generateStatusCodeStatisticReport(StatusCodeStatisticParameters statusCodeStatisticParameters) throws AutomationFrameworkException {

        getButton("ParametersPageFragment.parameters").click();
        
        getSelectorBox("ParametersPageFragment.aggregationType").selectorBox(statusCodeStatisticParameters.getAggregationType().getValue());
        getTextField("ParametersPageFragment.skipCodes").typeText(String.valueOf(statusCodeStatisticParameters.getSkipCodesWhichWereActiveLess()));
        
    }

    public void generateStatusCodeTrendReport(StatusCodeTrendParameters statusCodeTrendParameters) throws AutomationFrameworkException {
        getButton("ParametersPageFragment.parameters").click();

        getSelectorBox("ParametersPageFragment.aggregationType").selectorBox(statusCodeTrendParameters.getAggregationType().getValue());
        Assert.assertTrue(getCheckBox("ParametersPageFragment.showDetailsForTurbines").isChecked());
        getTextField("ParametersPageFragment.skipCodes").typeText(String.valueOf(statusCodeTrendParameters.getSkipCodesWhichWereActiveLess()));

        getButton("ParametersPageFragment.generate").click();
        
        pause(30000);
    }
}
