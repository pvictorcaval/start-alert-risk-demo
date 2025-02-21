package com.alert_risk.start_alert_risk_demo.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties(prefix = "alertrisk")
public class AppConfigurationProperties {
    private String apiAdvisorClimaTempoUrl;
    private String apiAdvisorClimaTempoToken;
    private String weatherApiUrl;
    private String weatherApiToken;

}
