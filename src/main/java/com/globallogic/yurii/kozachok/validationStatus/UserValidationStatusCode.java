package com.globallogic.yurii.kozachok.validationStatus;

public enum UserValidationStatusCode {
    PASSWORDS_NOT_EQUALS("Passwords are not equal"),
    INVALID_PASSWORD("Password isn't correct. It can be at least 8 symbols with at least one number"),
    INVALID_LOGIN("Login isn't correct. It can include only Latin symbols, numbers and '_'"),
    INCORRECT_FIRST_NAME("FirstName is incorrect. It can contain only letters"),
    INCORRECT_LAST_NAME("LastName is incorrect. It can contain only letters"),
    INCORRECT_EMAIL("You should input correct email"),
    OK("OK");

    private String statusMessage;

    private UserValidationStatusCode(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatus() {
        return statusMessage;
    }
}