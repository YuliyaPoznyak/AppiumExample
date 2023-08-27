package org.example.models;

import lombok.Getter;

@Getter
public enum HeadersValue {
    APP_JSON("application/json"),
    ACCEPT_ENCODING("gzip, deflate, br"),
    USER_AGENT("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");

    private String headerValue;

    HeadersValue(String headerValue) {
        this.headerValue = headerValue;
    }
}
