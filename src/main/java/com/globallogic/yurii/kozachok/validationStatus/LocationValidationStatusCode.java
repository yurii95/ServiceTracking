package com.globallogic.yurii.kozachok.validationStatus;

public enum LocationValidationStatusCode {

    ADDRESS_IS_INCORRECT("Adderss is incorrect. Try again"), 
    PHONE_IS_INCORRECT("Phone is incorrect. Try again"), 
    OK("OK");

    private String statusMessage;

    private LocationValidationStatusCode(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatus() {
        return statusMessage;
    }

}
