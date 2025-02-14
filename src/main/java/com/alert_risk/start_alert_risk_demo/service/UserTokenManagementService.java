package com.alert_risk.start_alert_risk_demo.service;

import com.alert_risk.start_alert_risk_demo.domain.UserTokenManagementLocalesResponse;
import com.alert_risk.start_alert_risk_demo.repository.UserTokenManagementRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserTokenManagementService {

    @Autowired
    private UserTokenManagementRepository repository;

    public UserTokenManagementLocalesResponse getUserTokenManagementLocales() {
        return repository.getUserTokenManagementLocales();
    }
}
