package com.example.chat_app_backend.exceptions;

public class HttpNotFound extends RuntimeException {
    public HttpNotFound(String message) {
        super(message);
    }
}
