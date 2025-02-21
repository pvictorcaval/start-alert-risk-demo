package com.alert_risk.start_alert_risk_demo.domain.weather;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Forecastday {
    private String date;
    private Integer dateEpoch;
    private Day day;
    private Astro astro;
    private List<Hour> hour;
}
