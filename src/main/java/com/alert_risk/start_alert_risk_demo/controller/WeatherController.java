package com.alert_risk.start_alert_risk_demo.controller;

import com.alert_risk.start_alert_risk_demo.domain.weather.WeatherForecastResponse;
import com.alert_risk.start_alert_risk_demo.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/weather")
public class WeatherController {

    private WeatherService service;

    @GetMapping(value = "/forecast", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WeatherForecastResponse> getForecast(
            @RequestParam String q,
            @RequestParam int days) {
        return new ResponseEntity<>(service.getForecast(q, days), HttpStatus.OK);
    }
}
