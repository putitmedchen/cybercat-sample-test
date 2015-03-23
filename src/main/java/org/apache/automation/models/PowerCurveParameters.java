package org.apache.automation.models;

import org.apache.automation.enums.reports.*;

/**
 * Created by sgo on 14.01.2015.
 */
public class PowerCurveParameters {

    private Boolean comparePowerCurve;
    private Boolean showDetailsForTurbines;
    private Boolean normalizePowerCurve;

    private OutdoorTemperatureDataSource outdoorTemperatureDataSource;
    private PowerMeasurementUnits powerMeasurementUnits;
    private PowerDataSource powerDataSource;
    private WindSpeedDataSource windSpeedDataSource;
    private DataSet dataSet;

    private String binCount;
    private String binSpan;
    private String WindSpeedOffset;

    private static PowerCurveParameters powerCurveParameters;

    //Getters and Setters
    public Boolean getComparePowerCurve() {
        return comparePowerCurve;
    }

    public void setComparePowerCurve(Boolean comparePowerCurve) {
        this.comparePowerCurve = comparePowerCurve;
    }

    public Boolean getShowDetailsForTurbines() {
        return showDetailsForTurbines;
    }

    public void setShowDetailsForTurbines(Boolean showDetailsForTurbines) {
        this.showDetailsForTurbines = showDetailsForTurbines;
    }

    public Boolean getNormalizePowerCurve() {
        return normalizePowerCurve;
    }

    public void setNormalizePowerCurve(Boolean normalizePowerCurve) {
        this.normalizePowerCurve = normalizePowerCurve;
    }

    public OutdoorTemperatureDataSource getOutdoorTemperatureDataSource() {
        return outdoorTemperatureDataSource;
    }

    public void setOutdoorTemperatureDataSource(OutdoorTemperatureDataSource outdoorTemperatureDataSource) {
        this.outdoorTemperatureDataSource = outdoorTemperatureDataSource;
    }

    public PowerMeasurementUnits getPowerMeasurementUnits() {
        return powerMeasurementUnits;
    }

    public void setPowerMeasurementUnits(PowerMeasurementUnits powerMeasurementUnits) {
        this.powerMeasurementUnits = powerMeasurementUnits;
    }

    public PowerDataSource getPowerDataSource() {
        return powerDataSource;
    }

    public void setPowerDataSource(PowerDataSource powerDataSource) {
        this.powerDataSource = powerDataSource;
    }

    public WindSpeedDataSource getWindSpeedDataSource() {
        return windSpeedDataSource;
    }

    public void setWindSpeedDataSource(WindSpeedDataSource windSpeedDataSource) {
        this.windSpeedDataSource = windSpeedDataSource;
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public String getBinCount() {
        return binCount;
    }

    public void setBinCount(String binCount) {
        this.binCount = binCount;
    }

    public String getBinSpan() {
        return binSpan;
    }

    public void setBinSpan(String binSpan) {
        this.binSpan = binSpan;
    }

    public String getWindSpeedOffset() {
        return WindSpeedOffset;
    }

    public void setWindSpeedOffset(String windSpeedOffset) {
        WindSpeedOffset = windSpeedOffset;
    }
// Setters and Getters


    public static PowerCurveParameters generateParameters() {
        powerCurveParameters = new PowerCurveParameters();

        powerCurveParameters.setComparePowerCurve(true);
        powerCurveParameters.setShowDetailsForTurbines(true);
        powerCurveParameters.setNormalizePowerCurve(true);

        powerCurveParameters.setOutdoorTemperatureDataSource(OutdoorTemperatureDataSource.OUTDOOR_TEMPERATURE_1s);
        powerCurveParameters.setPowerMeasurementUnits(PowerMeasurementUnits.KW);
        powerCurveParameters.setPowerDataSource(PowerDataSource.ACTIVE_POWER);
        powerCurveParameters.setWindSpeedDataSource(WindSpeedDataSource.ANALOG_DATALOG_WIND_SPEED_ACTIVE);
        powerCurveParameters.setDataSet(DataSet.SCADA_AVG_LOG);

        powerCurveParameters.setBinCount("80");
        powerCurveParameters.setBinSpan("0.6PPDD");
        powerCurveParameters.setWindSpeedOffset("0.2");

        return powerCurveParameters;
    }

}
