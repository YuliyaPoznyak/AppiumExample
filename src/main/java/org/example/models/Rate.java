package org.example.models;

import lombok.Data;

@Data
public class Rate {
    private double buyAmount;
    private double sellAmount;
    private String scaledBuyAmount;
    private String scaledSellAmount;
    private String buyAmountDelta;
    private String sellAmountDelta;
    private String buyCurrencyName;
    private String sellCurrencyName;
    private String buyCurrencyDescription;
    private String sellCurrencyDescription;
    private int buyCurrencyScale;
}
