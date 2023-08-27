package org.example.models;

import lombok.Getter;

@Getter
public class HTTPResponse {
    private int statusCode;
    private String responseBody;

    public HTTPResponse(int statusCode, String responseBody) {
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }

}
