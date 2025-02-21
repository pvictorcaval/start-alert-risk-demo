package com.alert_risk.start_alert_risk_demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class UserTokenManagementLocalesResponse {
    @JsonProperty(value = "max_allowed")
    private Integer maxAllowed;
    @JsonProperty(value = "locales")
    private List<Integer> locales;
}
