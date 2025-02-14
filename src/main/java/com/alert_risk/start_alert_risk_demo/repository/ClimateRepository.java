package com.alert_risk.start_alert_risk_demo.repository;

import com.alert_risk.start_alert_risk_demo.configuration.AppConfigurationProperties;
import com.alert_risk.start_alert_risk_demo.configuration.AppConfigurationEndpoint;
import com.alert_risk.start_alert_risk_demo.domain.ClimateRainResponse;
import com.alert_risk.start_alert_risk_demo.exception.BusinessException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.Objects;

@Repository
public class ClimateRepository {

    private final RestTemplate restTemplate;
    private final AppConfigurationProperties properties;

    public ClimateRepository(RestTemplate restTemplate, AppConfigurationProperties properties) {
        this.restTemplate = restTemplate;
        this.properties = properties;
    }

    public ClimateRainResponse getClimateRainLocale(long city, String latitude, String longitude) {
        try {
            UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(properties.getApiadvisorClimatempoUrl())
                    .path(AppConfigurationEndpoint.ADVISOR_CLIMATEMPO_CLIMATERAIN_PATH)
                    .pathSegment(Long.toString(city))
                    .queryParam("token", properties.getApiadvisorClimatempoToken());


            if (Objects.nonNull(latitude))
                uriBuilder.queryParam("latitude", latitude);
            if (Objects.nonNull(longitude))
                uriBuilder.queryParam("longitude", longitude);

            return restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, HttpEntity.EMPTY, ClimateRainResponse.class).getBody();
        } catch (HttpClientErrorException e) {
            throw new BusinessException("Erro ao chamar Advisor ClimaTempo API: " + e.getResponseBodyAsString(), e);
        } catch (Exception e) {
            throw new BusinessException("Erro interno no procesamento da chamada: " + e.getMessage(), e);
        }
    }
}
