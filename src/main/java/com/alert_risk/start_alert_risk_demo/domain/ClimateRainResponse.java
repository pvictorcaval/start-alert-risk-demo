package com.alert_risk.start_alert_risk_demo.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ClimateRainResponse {
    private long cityId;
    private String cityName;
    private String state;
    private String country;
    private List<Data> data;
}
