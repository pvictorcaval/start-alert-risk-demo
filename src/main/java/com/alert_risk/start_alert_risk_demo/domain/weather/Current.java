package com.alert_risk.start_alert_risk_demo.domain.weather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Current {
    private Integer lastUpdatedEpoch;
    private String lastUpdated;
    private Double tempC;
    private Double tempF;
    private Integer isDay;
    private Condition condition;
    private Double windMph;
    private Double windKph;
    private Integer windDegree;
    private String windDir;
    private Integer pressureMb;
    private Double pressureIn;
    private Integer precipMm;
    private Integer precipIn;
    private Integer humidity;
    private Integer cloud;
    private Integer feelslikeC;
    private Double feelslikeF;
    private Integer visKm;
    private Integer visMiles;
    private Integer uv;
    private Double gustMph;
    private Double gustKph;
    private AirQuality airQuality;
}
