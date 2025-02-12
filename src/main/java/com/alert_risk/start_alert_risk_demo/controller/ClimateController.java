package com.alert_risk.start_alert_risk_demo.controller;

import com.alert_risk.start_alert_risk_demo.domain.ClimateRainResponse;
import com.alert_risk.start_alert_risk_demo.service.ClimateService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("/climate")
public class ClimateController {

    private final ClimateService service;

    public ResponseEntity<ClimateRainResponse> getClimateRain(long city, String latitude, String longitude) {
        ClimateRainResponse response = service.getClimateRain(city, latitude, longitude);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
