package com.globallogic.yurii.kozachok.exceptions;

public class TransactionException extends Exception {
    private static final long serialVersionUID = -1964698682373676875L;

    public TransactionException(String message) {
        super(message);
    }

    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }
}



