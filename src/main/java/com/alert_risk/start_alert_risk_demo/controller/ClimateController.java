package com.alert_risk.start_alert_risk_demo.controller;

import com.alert_risk.start_alert_risk_demo.domain.ClimateRainResponse;
import com.alert_risk.start_alert_risk_demo.service.ClimateService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/climate")
public class ClimateController {

    private ClimateService service;

    @GetMapping(value = "/rain/locale/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClimateRainResponse> getClimateRainLocale(
            @PathVariable long id,
            @RequestParam(required = false) String latitude,
            @RequestParam(required = false) String longitude) {
        ClimateRainResponse response = service.getClimateRainLocale(id, latitude, longitude);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
