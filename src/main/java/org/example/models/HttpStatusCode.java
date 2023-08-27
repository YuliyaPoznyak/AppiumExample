package org.example.models;

import lombok.Getter;

@Getter
public enum HttpStatusCode {
    OK(200),
    NOT_FOUND(404);

    private int statusOfRequest;

    HttpStatusCode(int statusOfRequest) {
        this.statusOfRequest = statusOfRequest;
    }

}
