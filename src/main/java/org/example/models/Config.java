package org.example.models;

import lombok.Data;

@Data
public class Config {
    private Capabilities capabilities;
    private String url;
    private String cookie;
}
