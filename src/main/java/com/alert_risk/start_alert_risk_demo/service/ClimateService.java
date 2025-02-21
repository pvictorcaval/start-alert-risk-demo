package com.alert_risk.start_alert_risk_demo.service;

import com.alert_risk.start_alert_risk_demo.domain.ClimateRainResponse;
import com.alert_risk.start_alert_risk_demo.repository.ClimateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClimateService {

    private ClimateRepository repository;

    public ClimateRainResponse getClimateRainLocale(long city, String latitude, String longitude) {
        return repository.getClimateRainLocale(city, latitude, longitude);
    }
}
