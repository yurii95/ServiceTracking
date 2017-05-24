package com.globallogic.yurii.kozachok.messaging;

public interface BaseMessageProducer {
    void sendSimpleMessage(String message);
    void sendEmailMessage(Email email);
}
