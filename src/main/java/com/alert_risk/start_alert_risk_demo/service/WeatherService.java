package com.alert_risk.start_alert_risk_demo.service;

import com.alert_risk.start_alert_risk_demo.domain.weather.WeatherForecastResponse;
import com.alert_risk.start_alert_risk_demo.repository.WeatherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Service
public class WeatherService {

    private WeatherRepository repository;

    public WeatherForecastResponse getForecast(String q, int days) {
        return repository.getForecast(q, days);
    }
}
