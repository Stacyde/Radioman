package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void maxRadioStation(){
        Radio radio = new Radio();
        radio.getMaxRadioStation();
    }
    @Test
    public void minRadioStation(){
        Radio radio = new Radio();
        radio.getMinRadioStation();
    }
    @Test
    public void currentRadioStation(){
        Radio radio = new Radio();
        radio.getCurrentRadioStation();
    }
    @Test
    public void numberRadioStation(){
        Radio radio = new Radio();
        radio.getNumberRadioStation();
    }
    @Test
    public void currentVolume(){
        Radio radio = new Radio();
        radio.getCurrentVolume();
    }
    @Test
    public void numberVolume(){
        Radio radio = new Radio();
        radio.getNumberVolume();
    }
    @Test
    public void minVolume(){
        Radio radio = new Radio();
        radio.getMinVolume();
    }
    @Test
    public void maxVolume(){
        Radio radio = new Radio();
        radio.getMaxVolume();
    }
    @Test
    public void currentRadio(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
    }
    @Test
    public void numberRadio(){
        Radio radio = new Radio();
        radio.setNumberRadioStation(6);
    }
    @Test
    public void minRadio(){
        Radio radio = new Radio();
        radio.setMinRadioStation(6);
    }
    @Test
    public void maxRadio(){
        Radio radio = new Radio();
        radio.setMaxRadioStation(6);
    }
    @Test
    public void volumeCurrent(){
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
    }
    @Test
    public void volumeNumber(){
        Radio radio = new Radio();
        radio.setNumberVolume(6);
    }
    @Test
    public void volumeMin(){
        Radio radio = new Radio();
        radio.setMinVolume(6);
    }
    @Test
    public void volumeMax(){
        Radio radio = new Radio();
        radio.setMaxVolume(6);
    }





}