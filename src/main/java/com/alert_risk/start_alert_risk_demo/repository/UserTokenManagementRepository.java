package com.alert_risk.start_alert_risk_demo.repository;

import com.alert_risk.start_alert_risk_demo.configuration.AppConfigurationEndpoint;
import com.alert_risk.start_alert_risk_demo.configuration.AppConfigurationProperties;
import com.alert_risk.start_alert_risk_demo.domain.UserTokenManagementLocalesResponse;
import com.alert_risk.start_alert_risk_demo.exception.BusinessException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;

@Repository
public class UserTokenManagementRepository {

    private final RestTemplate restTemplate;
    private final AppConfigurationProperties properties;

    public UserTokenManagementRepository(RestTemplate restTemplate, AppConfigurationProperties properties) {
        this.restTemplate = restTemplate;
        this.properties = properties;
    }

    public UserTokenManagementLocalesResponse getUserTokenManagementLocales() {
        try {
            HashMap<String, String> params = new HashMap<>();
            params.put("token",properties.getApiadvisorClimatempoToken());

            String uriString = UriComponentsBuilder.fromUriString(properties.getApiadvisorClimatempoUrl())
                    .path(AppConfigurationEndpoint.ADVISOR_CLIMATEMPO_USERTOKENMANAGEMENT_LOCALES)
                    .buildAndExpand(params)
                    .toUriString();

            return restTemplate.exchange(uriString, HttpMethod.GET, HttpEntity.EMPTY, UserTokenManagementLocalesResponse.class).getBody();
        } catch (HttpClientErrorException e) {
            throw new BusinessException("Erro ao chamar Advisor ClimaTempo API: " + e.getResponseBodyAsString(), e);
        } catch (Exception e) {
            throw new BusinessException("Erro interno no procesamento da chamada: " + e.getMessage(), e);
        }
    }
}
