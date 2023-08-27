package org.example.models;

import lombok.Getter;

@Getter
public enum ApiMethod {
    POST("POST"),
    GET("GET"),
    PUT("PUT"),
    PATCH("PATCH"),
    DELETE("DELETE"),
    HEAD("HEAD");

    private String apiMethod;

    ApiMethod(String apiMethod) {
        this.apiMethod = apiMethod;
    }
}
