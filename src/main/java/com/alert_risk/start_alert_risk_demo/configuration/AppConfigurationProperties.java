package com.alert_risk.start_alert_risk_demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "alertrisk")
public class AppConfigurationProperties {
    private String apiadvisorClimatempoUrl;
    private String apiadvisorClimatempoToken;

    public String getApiadvisorClimatempoUrl() {
        return apiadvisorClimatempoUrl;
    }

    public void setApiadvisorClimatempoUrl(String apiadvisorClimatempoUrl) {
        this.apiadvisorClimatempoUrl = apiadvisorClimatempoUrl;
    }

    public String getApiadvisorClimatempoToken() {
        return apiadvisorClimatempoToken;
    }

    public void setApiadvisorClimatempoToken(String apiadvisorClimatempoToken) {
        this.apiadvisorClimatempoToken = apiadvisorClimatempoToken;
    }
}
