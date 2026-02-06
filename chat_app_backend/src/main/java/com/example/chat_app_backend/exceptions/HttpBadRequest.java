package com.example.chat_app_backend.exceptions;

public class HttpBadRequest extends RuntimeException {
    public HttpBadRequest(String message) {
        super(message);
    }
}
