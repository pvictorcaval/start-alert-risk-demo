package com.alert_risk.start_alert_risk_demo.controller;

import com.alert_risk.start_alert_risk_demo.domain.UserTokenManagementLocalesResponse;
import com.alert_risk.start_alert_risk_demo.service.UserTokenManagementService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api-manager/user-token")
public class UserTokenManagementController {

    @Autowired
    private UserTokenManagementService service;

    @GetMapping("/locales")
    public ResponseEntity<UserTokenManagementLocalesResponse> getUserTokenManagementLocales() {
        return new ResponseEntity<>(service.getUserTokenManagementLocales(), HttpStatus.OK);
    }
}
