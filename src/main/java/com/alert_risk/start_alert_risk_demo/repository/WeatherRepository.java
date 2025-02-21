package com.alert_risk.start_alert_risk_demo.repository;

import com.alert_risk.start_alert_risk_demo.configuration.AppConfigurationEndpoint;
import com.alert_risk.start_alert_risk_demo.configuration.AppConfigurationProperties;
import com.alert_risk.start_alert_risk_demo.domain.weather.WeatherForecastResponse;
import com.alert_risk.start_alert_risk_demo.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Objects;

@RequiredArgsConstructor
@Repository
public class WeatherRepository {

    private final RestTemplate restTemplate;
    private final AppConfigurationProperties properties;

    public WeatherForecastResponse getForecast(String q, int days) {
        try {
            UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(properties.getWeatherApiUrl())
                    .path(AppConfigurationEndpoint.WEATHER_FORECAST_JSON_PATH)
                    .queryParam("key", properties.getWeatherApiToken());


            if (Objects.nonNull(q))
                uriBuilder.queryParam("q", q);
            uriBuilder.queryParam("days", days);

            return restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, HttpEntity.EMPTY, WeatherForecastResponse.class).getBody();
        } catch (HttpClientErrorException e) {
            throw new BusinessException("Erro ao chamar Weather API: " + e.getResponseBodyAsString(), e);
        } catch (Exception e) {
            throw new BusinessException("Erro interno no procesamento da chamada: " + e.getMessage(), e);
        }
    }
}
