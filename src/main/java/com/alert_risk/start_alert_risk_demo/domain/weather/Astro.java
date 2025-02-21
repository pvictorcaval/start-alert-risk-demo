package com.alert_risk.start_alert_risk_demo.domain.weather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Astro {
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moonPhase;
    private String moonIllumination;
}
