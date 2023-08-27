package org.example.models;

import lombok.Data;

import java.util.ArrayList;
@Data
public class RateModel {
    private long fromTime;
    private long nextTime;
    private long previousTime;
    private ArrayList<Rate> rates;
}
