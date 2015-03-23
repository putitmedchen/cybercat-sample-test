package org.apache.automation.models;

import org.apache.automation.enums.reports.AggregationType;

/**
 * Created by sgo on 15.01.2015.
 */
public class StatusCodeTrendParameters {

    private AggregationType aggregationType;
    private Boolean showDetailsForTurbines;
    private int skipCodesWhichWereActiveLess;

    private static StatusCodeTrendParameters statusCodeTrendParameters;

    public AggregationType getAggregationType() {
        return aggregationType;
    }

    public void setAggregationType(AggregationType aggregationType) {
        this.aggregationType = aggregationType;
    }

    public Boolean getShowDetailsForTurbines() {
        return showDetailsForTurbines;
    }

    public void setShowDetailsForTurbines(Boolean showDetailsForTurbines) {
        this.showDetailsForTurbines = showDetailsForTurbines;
    }

    public int getSkipCodesWhichWereActiveLess() {
        return skipCodesWhichWereActiveLess;
    }

    public void setSkipCodesWhichWereActiveLess(int skipCodesWhichWereActiveLess) {
        this.skipCodesWhichWereActiveLess = skipCodesWhichWereActiveLess;
    }

    public static StatusCodeTrendParameters generateParameters() {
        statusCodeTrendParameters = new StatusCodeTrendParameters();

        statusCodeTrendParameters.setAggregationType(AggregationType.DAYS);
        statusCodeTrendParameters.setShowDetailsForTurbines(true);
        statusCodeTrendParameters.setSkipCodesWhichWereActiveLess(3);

        return statusCodeTrendParameters;
    }
}
