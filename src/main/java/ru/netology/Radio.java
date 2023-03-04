package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberVolume = 101;
    private int currentVolume = minVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int numberRadioStation = 10;
    private int currentRadioStation = minRadioStation;

    }