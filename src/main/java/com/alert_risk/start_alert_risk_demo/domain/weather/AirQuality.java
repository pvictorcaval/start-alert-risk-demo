package com.alert_risk.start_alert_risk_demo.domain.weather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirQuality {
    private Double co;
    private Double no2;
    private Double o3;
    private Integer so2;
    private Double pm25;
    private Integer pm10;
    private Integer usEpaIndex;
    private Integer gbDefraIndex;
}
