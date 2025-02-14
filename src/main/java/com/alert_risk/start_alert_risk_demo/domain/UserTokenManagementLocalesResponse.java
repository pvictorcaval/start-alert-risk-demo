package com.alert_risk.start_alert_risk_demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserTokenManagementLocalesResponse {
    private String maxAllowed;
    private List<Long> locales;
}
