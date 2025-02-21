package com.alert_risk.start_alert_risk_demo.domain.weather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alert {
    private String headline;
    private Object msgtype;
    private Object severity;
    private Object urgency;
    private Object areas;
    private String category;
    private Object certainty;
    private String event;
    private Object note;
    private String effective;
    private String expires;
    private String desc;
    private String instruction;
}
