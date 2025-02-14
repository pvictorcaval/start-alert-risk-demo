package com.alert_risk.start_alert_risk_demo.exception;

public class BusinessException extends RuntimeException {
    public BusinessException() {}

    public BusinessException(String msg) {super(msg);}

    public BusinessException(Throwable nested) {super(nested);}

    public BusinessException(String msg, Throwable nested) {super(msg, nested);}
}
