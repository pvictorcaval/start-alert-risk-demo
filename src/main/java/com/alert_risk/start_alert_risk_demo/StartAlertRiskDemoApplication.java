package com.alert_risk.start_alert_risk_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan({"com.alert_risk.start_alert_risk_demo.configuration"})
public class StartAlertRiskDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartAlertRiskDemoApplication.class, args);
	}

}
