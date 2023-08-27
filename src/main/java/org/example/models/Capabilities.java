package org.example.models;

import lombok.Data;

@Data
public class Capabilities {
    private String driverUrl;
    private String platformName;
    private String deviceName;
    private String platformVersion;
    private String automationName;
    private String appPackage;
    private String app;
}
