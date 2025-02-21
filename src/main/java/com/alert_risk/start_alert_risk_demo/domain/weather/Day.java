package com.alert_risk.start_alert_risk_demo.domain.weather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Day {
    private Double maxtempC;
    private Double maxtempF;
    private Double mintempC;
    private Double mintempF;
    private Double avgtempC;
    private Double avgtempF;
    private Double maxwindMph;
    private Double maxwindKph;
    private Integer totalprecipMm;
    private Integer totalprecipIn;
    private Integer avgvisKm;
    private Integer avgvisMiles;
    private Integer avghumidity;
    private Integer dailyWillItRain;
    private Integer dailyChanceOfRain;
    private Integer dailyWillItSnow;
    private Integer dailyChanceOfSnow;
    private Condition condition;
    private Integer uv;
}
