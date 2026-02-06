package com.example.chat_app_backend.exceptions;

public class HttpConflict extends RuntimeException {
    public HttpConflict(String message) {
        super(message);
    }
}
