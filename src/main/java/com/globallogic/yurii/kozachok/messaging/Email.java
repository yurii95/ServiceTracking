package com.globallogic.yurii.kozachok.messaging;


import java.io.Serializable;

public class Email implements Serializable {
    private String to;
    private String from;
    private String header;
    private String message;

    public Email(String to, String from, String header, String message) {
        this.to = to;
        this.from = from;
        this.header = header;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getHeader() {
        return header;
    }

    public String getMessage() {
        return message;
    }
}
