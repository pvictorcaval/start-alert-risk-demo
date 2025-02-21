package com.alert_risk.start_alert_risk_demo.domain.weather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Condition {
    private String text;
    private String icon;
    private Integer code;
}
