package com.alert_risk.start_alert_risk_demo.domain.weather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hour {
    private Integer timeEpoch;
    private String time;
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
    private Double feelslikeC;
    private Double feelslikeF;
    private Double windchillC;
    private Double windchillF;
    private Double heatindexC;
    private Double heatindexF;
    private Double dewpointC;
    private Double dewpointF;
    private Integer willItRain;
    private Integer chanceOfRain;
    private Integer willItSnow;
    private Integer chanceOfSnow;
    private Integer visKm;
    private Integer visMiles;
    private Integer gustMph;
    private Double gustKph;
    private Integer uv;
}
