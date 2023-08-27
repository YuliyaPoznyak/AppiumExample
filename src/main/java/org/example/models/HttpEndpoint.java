package org.example.models;

import lombok.Getter;

@Getter
public enum HttpEndpoint {
    NATIONAL_BANK_RATES("exchange-rates/rates"),
    API_URL("api/v1/free-zone-management/");

    private String endpoint;

    HttpEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

}
