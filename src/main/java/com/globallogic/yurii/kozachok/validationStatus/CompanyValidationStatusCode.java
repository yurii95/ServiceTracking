package com.globallogic.yurii.kozachok.validationStatus;

public enum CompanyValidationStatusCode {
    NAME_IS_INCORRECT("Name is incorrect. Try again"), OK("OK");

    private String statusMessage;

    private CompanyValidationStatusCode(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatus() {
        return statusMessage;
    }

}
