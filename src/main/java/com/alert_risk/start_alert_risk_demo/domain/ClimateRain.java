package com.alert_risk.start_alert_risk_demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClimateRain {
    private int last_year;
    private int normal;
    private int forecast;
}
