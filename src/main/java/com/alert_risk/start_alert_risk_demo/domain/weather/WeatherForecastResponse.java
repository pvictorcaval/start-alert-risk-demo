package com.alert_risk.start_alert_risk_demo.domain.weather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherForecastResponse {
    private Location location;
    private Current current;
    private Forecast forecast;
    private Alerts alerts;
}
